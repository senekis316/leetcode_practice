package practice.Java.study.nio.server;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NioMessageServer {

    private Selector selector;
    private SocketAddress socketAddress;
    private ServerSocketChannel serverSocketChannel;

    public NioMessageServer() throws IOException {
        this.selector = Selector.open();
        this.socketAddress = new InetSocketAddress(6667);
        this.serverSocketChannel = ServerSocketChannel.open();
        this.serverSocketChannel.bind(socketAddress);
        this.serverSocketChannel.configureBlocking(false);
        this.serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public void listen() throws IOException {
        while (true) {
            if (selector.select(10000) > 0) {
                Iterator<SelectionKey> selectionKeyIterator = selector.selectedKeys().iterator();
                while (selectionKeyIterator.hasNext()) {
                    SelectionKey selectionKey = selectionKeyIterator.next();
                    if (selectionKey.isAcceptable()) {
                        SocketChannel socketChannel = serverSocketChannel.accept();
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                        System.out.println(socketChannel.getRemoteAddress() + "上线");
                    }
                    if (selectionKey.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                        try {
                            ByteBuffer byteBuffer = (ByteBuffer) selectionKey.attachment();
                            broadcastMessage(socketChannel, byteBuffer.array());
                        } catch (IOException | InterruptedException e) {
                            System.out.println(socketChannel.getRemoteAddress() + "下线");
                            selectionKey.cancel();
                            socketChannel.close();
                        }
                    }
                    selectionKeyIterator.remove();
                }
            } else {
                System.out.println("服务器等待10秒, 无客户连接");
            }
        }
    }

    private void broadcastMessage(SocketChannel selfChannel, byte[] messageBytes) throws IOException, InterruptedException {

        if (StringUtils.isNotBlank(new String(messageBytes))) {
            System.out.println(messageBytes.length);
            for (Byte b : messageBytes) {
                System.out.println(b);
            }
            System.out.println("接受客户端消息:" + new String(messageBytes));
            for (SelectionKey selectionKey : selector.keys()) {
                if (selectionKey.channel() instanceof SocketChannel && selectionKey.channel() != selfChannel) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    socketChannel.write(ByteBuffer.wrap(messageBytes));
                    System.out.println("向客户端" + socketChannel.getRemoteAddress() + "发送消息:" + new String(messageBytes));
                }
            }
        }
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws IOException {
        NioMessageServer nioMessageServer = new NioMessageServer();
        nioMessageServer.listen();
    }

}

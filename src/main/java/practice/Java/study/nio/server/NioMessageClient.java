package practice.Java.study.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class NioMessageClient {

    private Selector selector;
    private SocketAddress socketAddress;
    private SocketChannel socketChannel;
    private String username;

    public NioMessageClient() throws IOException {
        this.selector = Selector.open();
        this.socketAddress = new InetSocketAddress(6667);
        this.socketChannel = SocketChannel.open(socketAddress);
        this.socketChannel.configureBlocking(false);
        this.socketChannel.register(selector, SelectionKey.OP_READ);
        this.username = socketChannel.getLocalAddress().toString().substring(1);
    }

    private void send(String message) {
        System.out.println(username + ": " + message);
        try {
            socketChannel.write(ByteBuffer.wrap(message.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void read() throws IOException {
        while (true) {
            if (selector.select(10000) > 0) {
                Iterator<SelectionKey> selectionKeyIterator = selector.selectedKeys().iterator();
                while (selectionKeyIterator.hasNext()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKeyIterator.next().channel();
                    socketChannel.configureBlocking(false);
                    ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                    socketChannel.read(byteBuffer);
                    System.out.println(new String(byteBuffer.array()));
                    selectionKeyIterator.remove();
                }
                selectionKeyIterator.remove();
            } else {
                System.out.println("客户端等待10秒, 服务器端无推送消息");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        NioMessageClient nioMessageClient = new NioMessageClient();
        Thread thread = new Thread(() -> {
            try {
                nioMessageClient.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入客户端发送消息:");
            nioMessageClient.send(scanner.nextLine());
        }
    }

}

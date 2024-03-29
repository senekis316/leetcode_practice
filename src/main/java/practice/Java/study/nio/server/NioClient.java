package practice.Java.study.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        SocketAddress socketAddress = new InetSocketAddress(6666);
        if (!socketChannel.connect(socketAddress)) {
            while (!socketChannel.finishConnect()) {
                System.out.println("因为连接需要时间, 客户端不会阻塞, 可以做其他工作");
            }
        }

        // 如果连接成功, 就发送数据
        String str = "hello, server";
        socketChannel.write(ByteBuffer.wrap(str.getBytes()));
        System.in.read();
    }

}

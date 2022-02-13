package practice.Java.study.nio.transfer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class NioFileTransportServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(7002));

        ByteBuffer buffer = ByteBuffer.allocate(4096);
        while (true) {
            SocketChannel socketChannel = serverSocketChannel.accept();
            long beginTime = new Date().getTime();
            int readCount;
            int total = 0;
            while ((readCount = socketChannel.read(buffer)) != -1) {
                total += readCount;
                buffer.rewind();
            }
            long endTime = new Date().getTime();
            System.out.println("服务器端接受字节总数: " + total + ", 耗时: " + (endTime - beginTime));
        }

    }

}

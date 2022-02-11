package practice.Java.study.nio.buffer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

public class ScatteringAndGatheringBuffer {

    public static void main(String[] args) throws IOException {
        // 使用ServerSocketChannel和SocketChannel网络
        SocketAddress socketAddress = new InetSocketAddress(7000);

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(socketAddress);

        // 创建buffer数组
        ByteBuffer[] byteBuffers = new ByteBuffer[2];
        byteBuffers[0] = ByteBuffer.allocate(5);
        byteBuffers[1] = ByteBuffer.allocate(3);

        SocketChannel socketChannel = serverSocketChannel.accept();

        int messageLength = 8;

        while (true) {

            int byteRead = 0;
            while (byteRead < messageLength) {
                byteRead += socketChannel.read(byteBuffers);
            }
            Arrays.stream(byteBuffers).forEach(buffer -> buffer.flip());

            int byteWrite = 0;
            while (byteWrite < messageLength) {
                byteWrite += socketChannel.write(byteBuffers);
            }

            Arrays.stream(byteBuffers).forEach(buffer -> buffer.clear());
            Arrays.stream(byteBuffers).forEach(buffer -> System.out.print(new String(buffer.array())));
            Arrays.stream(byteBuffers).forEach(buffer -> buffer.clear());

        }

    }

}

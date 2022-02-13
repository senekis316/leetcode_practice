package practice.Java.study.nio.transfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class NioFileTransportClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress(7002));

        long beginTime = new Date().getTime();
        FileInputStream fileInputStream = new FileInputStream("/Users/yufangxing/Downloads/gradle-4.8-all.zip");
        FileChannel fileChannel = fileInputStream.getChannel();
        int total = fileInputStream.available();
        fileChannel.transferTo(0, fileChannel.size(), socketChannel);
        long endTime = new Date().getTime();
        System.out.println("客户端发送字节总数: " + total + ", 耗时: " + (endTime - beginTime));

    }

}

package practice.Java.study.nio.buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWrite {

    public static void main(String[] args) throws IOException {
        String str = "hello, FileChannel";
        // 创建一个输出流 -> channel
        FileOutputStream fileOutputStream = new FileOutputStream("file01.txt");
        // 通过FileOutputStream获取对应的FileChannel
        FileChannel fileChannel = fileOutputStream.getChannel();
        // 创建一个ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 将数据写入buffer
        byteBuffer.put(str.getBytes());
        // 写入后将buffer切换到读模式
        byteBuffer.flip();
        // 将数据写入到channel
        fileChannel.write(byteBuffer);
        // 关闭流
        fileOutputStream.close();
    }

}

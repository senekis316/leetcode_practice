package practice.Java.study.nio.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelReadFile {

    public static void main(String[] args) throws IOException {
        // 创建一个文件输入流
        File file = new File("file01.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        // 根据输入流创建一个FileChannel
        FileChannel fileChannel = fileInputStream.getChannel();
        // 创建buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(fileInputStream.available());
        // 将channel中的数据写入buffer
        fileChannel.read(byteBuffer);
        // 翻转buffer, 切换到读取模式
        byteBuffer.flip();
        String str = new String(byteBuffer.array());
        System.out.println(str);
    }

}

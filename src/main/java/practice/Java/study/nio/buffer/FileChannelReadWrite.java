package practice.Java.study.nio.buffer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelReadWrite {

    public static void main(String[] args) throws IOException {
        File file1 = new File("file01.txt");
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileChannel fileChannel1 = fileInputStream.getChannel();

        File file2 = new File("file02.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileChannel fileChannel2 = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(fileInputStream.available());
        fileChannel1.read(byteBuffer);
        byteBuffer.flip();

        fileChannel2.write(byteBuffer);
        fileInputStream.close();
        fileOutputStream.close();
    }

}

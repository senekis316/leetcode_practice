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

        // 假设文件很大, buffer很小，需要循环读取
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);

        // 循环读取时一定主要，读写切换用flip, 每一轮读写完毕后，使用clear重置标志位，
        // 否则可能read = 0，导致死循环
        while (true) {
            byteBuffer.clear();
            int read = fileChannel1.read(byteBuffer);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();
            fileChannel2.write(byteBuffer);
        }
        fileChannel1.close();
        fileChannel2.close();
        fileInputStream.close();
        fileOutputStream.close();
    }

}

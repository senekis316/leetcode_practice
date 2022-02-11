package practice.Java.study.nio.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileChannelCopyFile {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("file01.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("file02.txt");

        FileChannel src = fileInputStream.getChannel();
        FileChannel dst = fileOutputStream.getChannel();

        dst.transferFrom(src, 0, src.size());
    }

}

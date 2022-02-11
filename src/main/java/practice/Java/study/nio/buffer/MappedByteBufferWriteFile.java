package practice.Java.study.nio.buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBufferWriteFile {

    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("file01.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        // 参数1: 启用读写模式
        // 参数2: 可以直接修改数据的起始位置
        // 参数3: 映射到内存的大小, 即将文件中多少个字节映射到内存中
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);
        mappedByteBuffer.put(0, (byte)'H');
        mappedByteBuffer.put(3, (byte)'9');
        randomAccessFile.close();
    }

}

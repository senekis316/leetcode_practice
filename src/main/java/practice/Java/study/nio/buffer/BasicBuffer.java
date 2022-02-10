package practice.Java.study.nio.buffer;

import java.nio.IntBuffer;

public class BasicBuffer {

    public static void main(String[] args) {
        // Buffer的简单使用:
        // 创建一个Int类型的Buffer, 大小为5, 即可以存放5个Int
        IntBuffer intBuffer = IntBuffer.allocate(5);
        // 向Buffer中存放数据
        intBuffer.put(10);
        intBuffer.put(11);
        intBuffer.put(12);
        intBuffer.put(13);
        intBuffer.put(14);
        // 使用flip方法, 将buffer内部的指针切换到buffer头部
        intBuffer.flip();
        // 循环存放
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i * 2);
        }
        // 从Buffer中读取数据
        // 使用flip方法进行buffer的读写切换
        intBuffer.flip();
        while(intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }

    }

}

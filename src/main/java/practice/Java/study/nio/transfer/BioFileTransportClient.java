package practice.Java.study.nio.transfer;

import org.apache.commons.io.IOUtils;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class BioFileTransportClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7001);
        long beginTime = new Date().getTime();
        InputStream inputStream = new FileInputStream("/Users/yufangxing/Downloads/gradle-4.8-all.zip");

        byte[] buffer = new byte[4096];
        long readCount;
        long total = 0;
        while ((readCount = inputStream.read(buffer)) != -1) {
            total += readCount;
            socket.getOutputStream().write(buffer);
        }
        long endTime = new Date().getTime();
        System.out.println("客户端发送字节总数: " + total + ", 耗时: " + (endTime - beginTime));
    }

}

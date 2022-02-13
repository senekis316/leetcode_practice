package practice.Java.study.nio.transfer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class BioFileTransportServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7001);
        while (true) {
            Socket socket = serverSocket.accept();
            long beginTime = new Date().getTime();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[4096];
            int readCount;
            int total = 0;
            while ((readCount = inputStream.read(buffer)) != -1) {
                total += readCount;
            }
            long endTime = new Date().getTime();
            System.out.println("服务器端接受字节总数: " + total + ", 耗时: " + (endTime - beginTime));
        }
    }

}

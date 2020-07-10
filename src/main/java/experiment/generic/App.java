package experiment.generic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
public class App<Generic> {

    private Map<String, Integer> map;

    private Map<String, Integer> getMap() {
        return map;
    }

    private void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public static void main(String[] args) throws NoSuchMethodException, IOException {
        ServerSocket serverSocket = new ServerSocket(6379);
        Socket clientSocket = serverSocket.accept();
        System.out.println(App.class.getTypeParameters()[0]);
        System.out.println(App.class.getDeclaredMethod("getMap").getGenericReturnType().getTypeName());
        System.out.println(App.class.getDeclaredMethod("setMap", Map.class).getGenericParameterTypes()[0].getTypeName());
    }

}

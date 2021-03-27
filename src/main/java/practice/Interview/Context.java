package practice.Interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Context {

    public static volatile Current current = new Current("A");

    public static void main(String[] args) throws InterruptedException {
        Thread aThread = new ABCThread("A", current);
        Thread bThread = new ABCThread("B", current);
        Thread cThread = new ABCThread("C", current);
        aThread.start();
        bThread.start();
        cThread.start();
        Thread.sleep(10000);

    }



}




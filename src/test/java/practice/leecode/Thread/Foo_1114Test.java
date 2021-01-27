package practice.leecode.Thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class Foo_1114Test {

    @Test
    public void threadFoo_1() throws InterruptedException {
        int[] invokes = new int[]{1,3,2};
        Foo foo = new Foo();
        for (int i = 0; i < invokes.length; i++) {
            Foo.PrintThread printThread = new Foo.PrintThread(invokes[i], foo);
            printThread.start();
        }
    }

    @Test
    public void threadFoo_2() throws InterruptedException {
        int[] invokes = new int[]{3,2,1};
        Foo foo = new Foo();
        for (int i = 0; i < invokes.length; i++) {
            Foo.PrintThread printThread = new Foo.PrintThread(invokes[i], foo);
            printThread.start();
        }
    }


}
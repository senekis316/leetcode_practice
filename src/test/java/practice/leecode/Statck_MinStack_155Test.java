package practice.leecode;

import org.junit.Test;
import practice.leecode.Stack.Statck_MinStack_155;

public class Statck_MinStack_155Test {

    @Test
    public void push() {
        Statck_MinStack_155 stack = new Statck_MinStack_155();
        for (int i = 0; i < 10000; i++) {
            stack.push(i);
            System.out.println(i);
        }
    }

}
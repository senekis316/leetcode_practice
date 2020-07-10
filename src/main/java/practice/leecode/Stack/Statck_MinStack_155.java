package practice.leecode.Stack;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * 通过Java提供的数据结构来实现
 */
public class Statck_MinStack_155 {

    private Stack<Integer> datas;

    private PriorityQueue<Integer> mins;

    public Statck_MinStack_155() {
        this.datas = new Stack<>();
        this.mins = new PriorityQueue<>();
    }

    public void push(int x) {
        datas.push(x);
        mins.add(x);
    }

    public void pop() {
        mins.remove(datas.pop());
    }

    public int top() {
        return datas.peek();
    }

    public int getMin() {
        return mins.peek();
    }

}

/**
 * 通过数组实现的最小堆栈
 */

/*public class Statck_MinStack_155 {

    private int count;

    private int[] array;

    private int min;

    public Statck_MinStack_155() {
        array = new int[16];
    }

    public void push(int x) {
        if (array.length <= count) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[count++] = x;
    }

    public void pop() {
        if (count > 0) {
            count--;
        }
    }

    public int top() {
        if (count > 0) {
            return array[count-1];
        }
        return -1;
    }

    public int getMin() {
        if (count > 1) {
            int min = array[0];
            for (int i = 1; i < count; i++) {
                min = min <= array[i] ? min : array[i];
            }
            return min;
        }
        if (count == 1) {
            return array[0];
        }
        return -1;
    }

}*/

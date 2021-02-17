package practice.leecode.Sort;

import java.util.PriorityQueue;

public class KthLargest_703 {

    private int k;
    private PriorityQueue<Integer> queue;

    public KthLargest_703(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        queue.add(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }

}

package practice.leecode.LinkedTable;

import java.util.HashSet;
import java.util.Set;
import practice.utils.ListNode;

public class NumComponents_817 {

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> nums = new HashSet<>();
        for (int num : G) {
            nums.add(num);
        }
        int sum = 0;
        while (head != null) {
            if (nums.contains(head.val) && (head.next == null || !nums.contains(head.next.val))) {
                sum++;
            }
            head = head.next;
        }
        return sum;
    }

}

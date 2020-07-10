package practice.leecode.LinkedTable;

import java.util.HashMap;
import java.util.Map;
import practice.utils.ListNode;

public class RemoveZeroSumSubLists_1171 {

    public ListNode removeZeroSumSubLists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> nodeMap = new HashMap<>();
        int sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            nodeMap.put(sum, node);
        }
        sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            node.next = nodeMap.get(sum).next;
        }
        return dummy.next;
    }
}

package practice.leecode.qq.LinkedTable;

import org.junit.Test;
import practice.leecode.qq.LinkedTable.LinkedSorts;
import practice.leecode.qq.LinkedTable.LinkedSorts.ListNode;

import static org.junit.Assert.*;

public class SortListTest {

    @Test
    public void sortList() {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedSorts linkedSort = new LinkedSorts();
        assertEquals(1, linkedSort.sortList(node1).val);
        assertEquals(2, linkedSort.sortList(node2).val);
        assertEquals(3, linkedSort.sortList(node3).val);
        assertEquals(4, linkedSort.sortList(node4).val);

    }
}
package practice.leecode.Tencent.LinkedTable;

import org.junit.Test;

import practice.leecode.Tencent.LinkedTable.MergeKLists.ListNode;

import static org.junit.Assert.*;

public class MergeKListsTest {

    @Test
    public void mergeKLists() {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode7 = new ListNode(2);
        ListNode listNode8 = new ListNode(6);
        listNode7.next = listNode8;

        ListNode[] lists = new ListNode[] { listNode1, listNode4, listNode7 };

        MergeKLists mergeKLists = new MergeKLists();
        mergeKLists.mergeKLists(lists);


    }

}
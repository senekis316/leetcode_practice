package practice.leecode.Tencent.LinkedTable;


public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length == 0) return null;
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = (left + right) / 2;
        ListNode listNode1 = mergeKLists(lists, left, mid);
        ListNode listNode2 = mergeKLists(lists, mid + 1, right);
        return mergeKLists(listNode1, listNode2);
    }

    private ListNode mergeKLists(ListNode listNode1, ListNode listNode2) {

        ListNode result = new ListNode(0);
        ListNode tmp = result;

        while(listNode1!=null && listNode2!=null) {

            ListNode listNode;
            if (listNode1.val < listNode2.val) {
                listNode = new ListNode(listNode1.val);
                listNode1 = listNode1.next;
            } else {
                listNode = new ListNode(listNode2.val);
                listNode2 = listNode2.next;
            }
            tmp.next = listNode;
            tmp = listNode;
        }

        while(listNode1!=null) {
            tmp.next = listNode1;
            tmp = listNode1;
            listNode1 = listNode1.next;
        }

        while(listNode2!=null) {
            tmp.next = listNode2;
            tmp = listNode2;
            listNode2 = listNode2.next;
        }

        return result.next;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

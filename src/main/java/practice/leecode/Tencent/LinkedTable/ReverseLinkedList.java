package practice.leecode.qq.LinkedTable;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode preNode = null;
        ListNode currentNode = head;

        while(currentNode!=null) {
            ListNode next = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = next;
        }

        return preNode;

    }

    /*public ListNode sortList(ListNode head) {

        List<ListNode> nodeList = new ArrayList<>();

        while(head!=null) {
            nodeList.add(head);
            head = head.next;
        }

        for (int i=nodeList.size()-1; i>0; i--) {
            nodeList.get(i).next = nodeList.get(i-1);
        }

        return nodeList.get(nodeList.size()-1);

    }*/

}

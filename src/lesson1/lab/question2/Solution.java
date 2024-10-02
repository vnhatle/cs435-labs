package lesson1.lab.question2;

public class Solution {

    public static void main(String [] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        listNode.print();
        ListNode reversedListNode = reverseListByIterative(listNode);
        reversedListNode.print();
    }

    static ListNode reverseListByIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    static ListNode reverseListByRecursive(ListNode head) {
        return head;
    }
}

package lesson1.lab.question2;

import lesson1.practice.Node;

public class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void print() {
        ListNode temp = this;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

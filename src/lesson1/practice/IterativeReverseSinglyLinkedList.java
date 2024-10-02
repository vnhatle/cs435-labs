package lesson1.practice;

public class IterativeReverseSinglyLinkedList {

    public static void main(String [] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.print();

        linkedList.reverse();
        linkedList.print();
    }
}

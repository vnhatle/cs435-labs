package lesson1.lab.question1;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        int size = this.queue.size();
        this.queue.add(x);

        for (int i = 0; i < size; i++) {
            this.queue.add(this.queue.remove());
        }
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return this.queue.remove();
    }

    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return this.queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

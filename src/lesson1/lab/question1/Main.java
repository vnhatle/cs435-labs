package lesson1.lab.question1;

public class Main {

    public static void main(String [] args) {
        MyStack obj = new MyStack();
        obj.push(5);
        obj.push(4);
        Object param_2 = obj.pop();
        Object param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}

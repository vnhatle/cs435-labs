package lesson1.practice;

public class IterativeFibonacci {

    public static void main(String[] args) {
         System.out.println(fibonacci(10));
//        fibonacci(10);
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return n;
        }

        if (n < 3) {
            return 1;
        }

        int prevFibonacci = 1;
        int nextFibonacci = 1;
        for (int i = 2; i < n; i++) {
            int temp = prevFibonacci;
            prevFibonacci = nextFibonacci;
            nextFibonacci += temp;
        }
        return nextFibonacci;
    }
}

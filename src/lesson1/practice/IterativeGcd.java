package lesson1.practice;

public class IterativeGcd {

    public static void main(String [] args) {
        System.out.println(gcd(37, 14));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

package lesson1.practice;

public class Gcd {

    public static void main(String[] args) {
        System.out.println(gcd(37, 14));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

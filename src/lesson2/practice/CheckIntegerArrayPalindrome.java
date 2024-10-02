package lesson2.practice;

public class CheckIntegerArrayPalindrome {

    public static void main(String [] args) {
        System.out.println(isPalindrome(new int[] {1, 2, 1}));
        System.out.println(isPalindrome(new int[] {1, 2, 2, 1}));
        System.out.println(isPalindrome(new int[] {1, 2, 3, 2, 1}));
        System.out.println(isPalindrome(new int[] {1, 2, 3, 1}));
    }

    static boolean isPalindrome(int [] array) {
        for (int i = 0; i < array.length/2 ; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

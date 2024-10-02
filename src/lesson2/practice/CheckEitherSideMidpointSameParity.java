package lesson2.practice;

public class CheckEitherSideMidpointSameParity {

    public static void main(String [] args) {
        System.out.println(isSameParity(new int [] {1, 2, 3}));
        System.out.println(isSameParity(new int [] {1, 2, 4}));
        System.out.println(isSameParity(new int [] {1, 2, 2, 3}));
    }

    static boolean isSameParity(int [] array) {
        for (int i = 0; i < array.length/2 ; i++) {
            if (array[i] % 2 != array[array.length - 1 - i] % 2) {
                return false;
            }
        }
        return true;
    }
}

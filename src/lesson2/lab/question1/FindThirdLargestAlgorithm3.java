package lesson2.lab.question1;

public class FindThirdLargestAlgorithm3 {

    public static void main(String [] args) {
        System.out.println(findThirdLargest(new int [] { 1, 5, 25, 20, 21, 18, 19}));
        System.out.println(findThirdLargest(new int [] { 1, 5, 20, 20, 20, 18, 19}));
    }

    static int findThirdLargest(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array[array.length - 3];
    }
}

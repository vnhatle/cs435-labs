package lesson2.lab.question1;

public class FindThirdLargestAlgorithm1 {

    public static void main(String [] args) {
        System.out.println(findThirdLargest(new int [] { 1, 5, 20, 20, 20, 18, 19}));
    }

    static int findThirdLargest(int [] array) {
        int firstLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                firstLargest = array[i];
            }
        }

        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] <= firstLargest) {
                secondLargest = array[i];
            }
        }

        int thirdLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > thirdLargest && array[i] <= secondLargest) {
                thirdLargest = array[i];
            }
        }
        return thirdLargest;
    }
}

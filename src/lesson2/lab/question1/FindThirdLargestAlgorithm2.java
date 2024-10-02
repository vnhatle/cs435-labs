package lesson2.lab.question1;

public class FindThirdLargestAlgorithm2 {

    public static void main(String [] args) {
        System.out.println(findThirdLargest(new int [] { 1, 5, 25, 20, 21, 18, 19}));
        System.out.println(findThirdLargest(new int [] { 1, 5, 20, 20, 20, 18, 19}));
    }

    static int findThirdLargest(int [] array) {
        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] >= secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = array[i];
            } else if (array[i] >= thirdLargest){
                thirdLargest = array[i];
            }
        }
        return thirdLargest;
    }
}

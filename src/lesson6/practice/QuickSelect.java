package lesson6.practice;

public class QuickSelect {

    public static void main(String [] args) {
        // Find 3rd element
        int [] array = new int[] {5, 9, 4, 2, 10};
        System.out.println(quickSelect(array, 0, 4, 3));

        // Find 2nd largest element
        int ith = 5 - 2 + 1;
        System.out.println(quickSelect(new int [] {3,2,1,5,6,4}, 0, 5, ith));
        // Find 4th largest element
        ith = 8 - 4 + 1;
        System.out.println(quickSelect(new int [] {3,2,3,1,2,4,5,5,6}, 0, 8, ith));
    }

    static int quickSelect(int [] array, int start, int stop, int k) {
        if (stop < start || k > stop) {
            return 0;
        }

        int pivotPos = findMedianOfThree(array, start, stop);
        swap(array, pivotPos, stop);

        int pivot = array[stop];
        int i = start;
        int j = stop - 1;

        while (true) {
            while(i <= j && array[i] < pivot) i++;
            while(i <= j && array[j] > pivot) j--;

            if (i <= j) {
                swap(array, i++, j--);
            } else {
                break;
            }
        }

        swap(array, stop, i);
        if (k > (i - 1) && k <= i) {
            return array[k];
        } else if (k <= i - 1) {
            return quickSelect(array, start, i - 1, k);
        } else {
            return  quickSelect(array, i + 1, stop, k);
        }
    }

    static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int findMedianOfThree(int [] array, int start, int stop) {
        int middle = (start + stop)/2;
        int startVal = array[start];
        int stopVal = array[stop];
        int middleVal = array[middle];

        int median = middle;

        if (startVal >= stopVal) {
            if (startVal <= middleVal) {
                median = start;
            } else if (stopVal >= middleVal) {
                median = stop;
            }
        } else {
            if (stopVal <= middleVal) {
                median = stop;
            } else if (startVal >= middleVal) {
                median = start;
            }
        }
        return median;
    }
}

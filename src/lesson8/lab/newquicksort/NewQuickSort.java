package lesson8.lab.newquicksort;

import java.util.Arrays;

public class NewQuickSort {

    public static void main(String [] args) {
        int [] array = new int [] { 5, 9, 4, 2, 10};
        newQuickSort(array, 0, 4, -1);
        System.out.println(Arrays.toString(array));
    }

    static void newQuickSort(int[] arr, int start, int stop, int pivot) {
        if (start >= stop) {
            return;
        }

        if (pivot == -1) {
            pivot = findMedian(arr, start, stop);
        }

        swap(arr, pivot, stop);
        int pivotVal = arr[stop];

        int i = start, j = stop - 1;

        while(true) {
            while (i <= j && arr[i] < pivotVal) i++;
            while (i <= j && arr[j] > pivotVal) j--;
            if (i <= j) {
                swap(arr, i++, j--);
            } else {
                break;
            }
        }

        swap(arr, i, stop);
        newQuickSort(arr, start, i - 1, (start + i - 1)/2);
        newQuickSort(arr, i + 1, stop, (i + 1 + stop)/2);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int findMedian(int [] arr, int start, int stop) {
        int mid = (start + stop) / 2;
        int midVal = arr[mid];
        int startVal = arr[start];
        int stopVal = arr[stop];

        int median = mid;

        if (startVal >= stopVal) {
            if (stopVal > midVal) {
                median = stop;
            } else if (startVal < midVal) {
                median = start;
            }
        } else {
            if (startVal > midVal) {
                median = start;
            } else if (stopVal < midVal) {
                median = stop;
            }
        }
        return median;
    }
}

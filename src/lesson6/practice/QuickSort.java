package lesson6.practice;

import java.util.Arrays;

public class QuickSort {

    public static void main(String [] args) {
        int [] array = new int [] { 5, 9, 4, 2, 10};
        quickSort(array, 0, 4);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int [] array, int start, int stop) {
        if (stop < start) {
            return;
        }

        int pivotPos = findMedianThree(array, start, stop);
        swap(array, pivotPos, stop);

        int pivot = array[stop];
        int i = start;
        int j = stop - 1;

        while(true) {
            while (i <= j && array[i] < pivot) i++;
            while (i <= j && array[j] > pivot) j--;

            if (i <= j) {
                swap(array, i++, j--);
            } else {
                break;
            }
        }

        swap(array, stop, i);
        quickSort(array, start, i - 1);
        quickSort(array, i + 1, stop);
    }

    static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int findMedianThree(int [] array, int start, int stop) {
        int middle = (start + stop)/2;
        int startVal = array[start];
        int endVal = array[stop];
        int middleVal = array[middle];

        int median = middle;
        if (startVal >= middleVal) {
            if (startVal <= endVal) {
                median = start;
            } else if (endVal > middleVal) {
                median = stop;
            }
        } else {
            if (startVal >= endVal) {
                median = start;
            } else if (endVal < middleVal) {
                median = stop;
            }
        }

        return  median;
    }
}

package lesson11.lab;

import java.util.Arrays;

public class Q1BuildHeapTopDown {

    public static void main(String [] args) {
        int [] arr = new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        buildMaxHeapTopDown(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        int [] arr1 = new int [] {0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15};
        buildMaxHeapTopDown(arr1, arr1.length);
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = new int [] {0, 4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15};
        buildMaxHeapTopDown(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));

        int [] arr3 = new int [] {0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9};
        buildMaxHeapTopDown(arr3, arr3.length);
        System.out.println(Arrays.toString(arr3));
    }

    /**
     * Question 1: Build max heap top down
     * @param arr
     * @param n
     */
    private static void buildMaxHeapTopDown(int [] arr, int n) {
        for (int i = 1; i < n; i++) {
            upHeap(arr, i);
        }
    }

    private static void upHeap(int [] arr, int i) {
        int j = i;
        while (j > 1 && arr[j/2] < arr[j]) {
            swap(arr, j, j/2);
            j = j/2;
        }
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

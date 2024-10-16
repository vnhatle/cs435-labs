package lesson11.lab;

import java.util.Arrays;

public class Q2BuildHeapBottomUp {

    public static void main(String [] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        buildMaxHeapBottomUp(arr, arr.length);
        System.out.println("Build max heap bottom up: " + Arrays.toString(arr));

        heapSortPhaseTwo(arr, arr.length);
        System.out.println("Heap sort: " + Arrays.toString(arr));

        int [] arr1 = new int [] {2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15};
        buildMaxHeapBottomUp(arr1, arr1.length);
        System.out.println("Build max heap bottom up: " + Arrays.toString(arr1));

        heapSortPhaseTwo(arr1, arr1.length);
        System.out.println("Heap sort: " + Arrays.toString(arr1));

        int [] arr2 = new int [] {4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15};
        buildMaxHeapBottomUp(arr2, arr2.length);
        System.out.println("Build max heap bottom up: " + Arrays.toString(arr2));

        heapSortPhaseTwo(arr2, arr2.length);
        System.out.println("Heap sort: " + Arrays.toString(arr2));

        int [] arr3 = new int [] {5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9};
        buildMaxHeapBottomUp(arr3, arr3.length);
        System.out.println("Build max heap bottom up: " + Arrays.toString(arr3));

        heapSortPhaseTwo(arr3, arr3.length);
        System.out.println("Heap sort: " + Arrays.toString(arr3));
    }

    /**
     * Question 2: Build max heap bottom up
     * @param arr
     * @param n
     */
    private static void buildMaxHeapBottomUp(int [] arr, int n) {
        for (int i = n/2; i > 1; i--) {
            downHeap(arr, i, n);
        }
    }

    private static void downHeap(int [] arr, int i, int n) {
        int j = i;
        int k = maxChildIndex(arr, j, n);
        while(k != 0) {
            swap(arr, j, k);
            j = k;
            k = maxChildIndex(arr, j, n);
        }
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int maxChildIndex(int [] arr, int j, int n) {
        int k = j;
        if (2 * j <= n && arr[2 * j] > arr[k]) {
            k = 2 * j;
        }

        if (2 * j  + 1 <= n && arr[2 * j + 1] > arr[k]) {
            k = 2 * j + 1;
        }

        if (k == j) return 0;
        return k;
    }

    /**
     * Question 3: Heapsort phase 2
     * @param arr
     * @param n
     */
    private static void heapSortPhaseTwo(int [] arr, int n) {
        for (int i = n; i >= 2; i--) {
            swap(arr, 1, i);
            downHeap(arr, 1, i - 1);
        }
    }
}

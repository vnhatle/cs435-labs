package lesson3.practice;

import java.util.Arrays;

/**
 * Write two or more Algorithms to compute consecutive sums. Determine their time  and space complexities.
 *
 * Given an integer array A[0 ... n-1] and a positive integer k <= n, return an array ConsecutiveSum with following property:
 * ConsecutiveSum[0] = A[0] + A[1] + ... + A[k-1],
 * ConsecutiveSum[1] = A[1] + A[2] + ... + A[k],
 * and so on.
 */
public class ConsecutiveSum {

    public static void main(String [] args) {
        System.out.println(Arrays.toString(consecutiveSum(new int [] {7, 2, 8, 9, 10, 4, 6, 11, 1}, 3)));
    }

    static int[] consecutiveSum(int [] array, int k) {
        int len = array.length;
        if (len < k) {
            return new int [] {};
        }

        int[] consecutiveSumArr = new int [len - k + 1];

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        consecutiveSumArr[0] = sum;

        for (int i = 1; i < len - k + 1; i++) {
            sum = sum - array[i - 1] + array[k + i - 1];
            consecutiveSumArr[i] = sum;
        }

        return consecutiveSumArr;
    }
}

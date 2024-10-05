package lesson4.lab.question1and2;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumOneSolution {

    public static void main(String [] args) {
        System.out.print(findSubsetSumOneSolution(new int [] {3, 4, 7, 8}, 15));
    }

    static List<Integer> findSubsetSumOneSolution(int [] array, int sum) {
        List<Integer> subsetResult = new ArrayList<>();

        int len = array.length;

        boolean [][] subset = new boolean[sum + 1][len + 1];

        // if sum is 0, then answer is true
        for (int i = 0; i <= len; i++) {
            subset[0][i] = true;
        }

        // if sum is not 0 and array is empty, then answer is false
        for (int i = 0; i <= len; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= len; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= array[j -1]) {
                    subset[i][j] = subset[i][j] || subset[i - array[j - 1]][j - 1];
                }
            }
        }

        // find subset
        int i = sum;
        int j = len;
        while (i > 0 && j > 0) {
            if (subset[i][j] && !subset[i][j - 1]) {
                subsetResult.add(array[j - 1]);
                i -= array[j - 1];
            }
            j--;
        }

        return subsetResult;
    }
}

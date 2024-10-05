package lesson4.lab.question1and2;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumAllSolutions {

    public static void main(String [] args) {
        System.out.println(findSubsetSumAllSolutions(new int[] {3, 4, 7, 8}, 15));
    }

    static List<List<Integer>> findSubsetSumAllSolutions(int [] array, int sum) {
        List<List<Integer>> allSubsetsResult = new ArrayList<>();

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

        // Find all subsets
        List<Integer> subsetResult = new ArrayList<>();
        findSubsets(subset, array, sum, len, subsetResult, allSubsetsResult);

        return allSubsetsResult;
    }

    static void findSubsets(boolean subset[][], int array[], int sum, int len, List<Integer> subsetResult, List<List<Integer>> allSubsetsResult) {
        // Base Cases
        if (sum == 0) {
            allSubsetsResult.add(new ArrayList<>(subsetResult));
            return;
        }

        if (len == 0) {
            return;
        }

        // If the current element is not included in the subset
        if (subset[sum][len - 1]) {
            findSubsets(subset, array, sum, len - 1, subsetResult, allSubsetsResult);
        }

        // If the current element is included in the subset
        if (sum >= array[len - 1] && subset[sum - array[len - 1]][len - 1]) {
            subsetResult.add(array[len - 1]);
            findSubsets(subset, array, sum - array[len -1], len - 1, subsetResult, allSubsetsResult);
            subsetResult.remove(subsetResult.size() - 1);
        }
    }
}

package lesson4.lab.question1and2;

public class SubsetSumTF {

    public static void main(String [] args) {
        System.out.println(findSubsetSumTF(new int [] {3, 4, 7, 8}, 15));
    }

    static boolean findSubsetSumTF(int [] array, int sum) {
        int len = array.length;

        boolean subset[][] = new boolean [sum + 1][len + 1];

        // if sum is 0, then answer is true
        for (int i = 0; i <= len; i++) {
            subset[0][i] = true;
        }

        // if sum is not 0 and array is empty, then answer is false
        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= len; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= array[j - 1]) {
                    subset[i][j] = subset[i][j] || subset[i - array[j - 1]][j - 1];
                }
            }
        }
        return subset[sum][len];
    }
}

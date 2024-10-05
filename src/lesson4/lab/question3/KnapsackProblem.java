package lesson4.lab.question3;

public class KnapsackProblem {

    public static void main(String [] args) {
        int val[] = {25, 12, 24, 16, 28}; // Values of items
        int wt[] = {5, 6, 8, 2, 7};    // Weights of items
        int W = 20;                 // Maximum allowable weight
        int n = val.length;

        System.out.println("Maximum value in Knapsack = " + knapSack(W, wt, val, n));
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom-up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        return K[n][W];
    }
}

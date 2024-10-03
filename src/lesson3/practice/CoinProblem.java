package lesson3.practice;

import java.util.Arrays;

/**
 * Someone gave you 81 coins. All of them look alike. However, exactly one has lesser weight.
 *
 * Write an algorithm to identify the coin with lesser weight. You are given a "Mechanical Scale".
 * Your algorithm can use the scale at most FOUR times.
 *
 * What is the time complexity (Assume one use of the scale is O(1)).
 */
public class CoinProblem {

    public static void main(String [] args) {
        System.out.println(findLesserWeightCoin(new int [] {
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        }));
    }

    static int findLesserWeightCoin(int [] coins) {
        int len = coins.length;

        if (len == 3) {
            if (coins[0] > coins[1]) {
                return coins[1];
            } else if (coins[0] == coins[1]) {
                return coins[2];
            }
            return coins[0];
        }

        int [] coins1 = Arrays.copyOfRange(coins, 0, len/3);
        int [] coins2 = Arrays.copyOfRange(coins, len/3, len/3 * 2);
        int [] coins3 = Arrays.copyOfRange(coins, len/3 * 2, len);

        int sumCoins1 = Arrays.stream(coins1).sum();
        int sumCoins2 = Arrays.stream(coins2).sum();

        if (sumCoins1 > sumCoins2) {
            return findLesserWeightCoin(coins2);
        } else if (sumCoins1 == sumCoins2) {
            return findLesserWeightCoin(coins3);
        }
        return findLesserWeightCoin(coins1);
    }
}

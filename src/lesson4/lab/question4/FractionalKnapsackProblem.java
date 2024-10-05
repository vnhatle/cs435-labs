package lesson4.lab.question4;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackProblem {

    static double fractionalKnapsack(int W, Item arr[], int n) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (arr[i].weight <= W) {
                W -= arr[i].weight;
                totalValue += arr[i].value;
            } else {
                totalValue += arr[i].value * ((double) W / arr[i].weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String args[]) {
        Item arr[] = {new Item(25, 5), new Item(12, 6), new Item(24, 8), new Item(16, 2), new Item(28, 7)};
        int W = 20; // Maximum allowable weight
        int n = arr.length;

        System.out.println("Maximum value in Knapsack = " + fractionalKnapsack(W, arr, n));
    }
}


class Item {
    int value, weight;

    // Item constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

package com.tit.allsortingproblems.sortproductprices;

public class SortProductPrices {
    public static void main(String[] args) {
        // Array of product prices
        int[] prices = {90, 70, 50, 80, 60, 666,26,34,94,59,64,88,56,85, 40, 30};

        // Create an instance of QuickSort
        QuickSort qs = new QuickSort();

        System.out.println("Original Product Prices:");
        qs.printArray(prices);

        // Perform Quick Sort
        qs.sort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        qs.printArray(prices);
    }

}

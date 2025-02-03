package com.tit.allsortingproblems.sortbookprices;

// Creating a class SortBookPrices to demonstrate the Merge Sort algorithm
class SortBookPrices
{
    public static void main(String[] args) {
        // Array of book prices
        int[] prices = {450, 200, 300, 100, 556,499,996,346,225,569,444,350, 250, 400};

        // Create an instance of MergeSort
        MergeSort ms = new MergeSort();

        System.out.println("Original Book Prices:");
        ms.printArray(prices);

        // Perform Merge Sort
        ms.sort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices:");
        ms.printArray(prices);
    }
}

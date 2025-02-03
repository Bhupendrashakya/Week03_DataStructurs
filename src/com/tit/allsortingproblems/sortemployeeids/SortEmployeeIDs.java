package com.tit.allsortingproblems.sortemployeeids;

class SortEmployeeIDs
{
    public static void main(String[] args) {
        // Array of employee IDs
        int[] ids = {102, 54, 89, 32, 76, 100, 55,10,88,61,64,11,44,96,45};

        // Create an instance of InsertionSort
        InsertionSort sorter = new InsertionSort();

        System.out.println("Original Employee IDs:");
        sorter.printArray(ids);

        // Perform Insertion Sort
        sorter.insertionSort(ids);

        System.out.println("Sorted Employee IDs:");
        sorter.printArray(ids);
    }
}
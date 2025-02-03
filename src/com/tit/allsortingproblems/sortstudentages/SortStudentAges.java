package com.tit.allsortingproblems.sortstudentages;

// Creating a class SortStudentAges to demonstrate the Counting Sort algorithm
class SortStudentAges
{
    public static void main(String[] args) {
        // Array of student ages
        int[] ages = {12, 14, 13, 10, 15, 16, 17, 18, 11};

        // Create an instance of CountingSort
        CountingSort sorter = new CountingSort();

        System.out.println("Original Student Ages:");
        sorter.printArray(ages);

        // Perform Counting Sort
        sorter.countingSort(ages);

        System.out.println("Sorted Student Ages:");
        sorter.printArray(ages);
    }
}

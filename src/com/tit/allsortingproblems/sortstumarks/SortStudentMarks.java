package com.tit.allsortingproblems.sortstumarks;

// Creating a class SortStudentMarks to demonstrate the Bubble Sort algorithm
class SortStudentMarks
{
    public static void main(String[] args) {
        // Array of student marks
        int[] marks = {87, 76, 90, 65, 78, 92, 80, 64, 33, 46, 88 , 44};

        // Create an instance of BubbleSort
        BubbleSort sorter = new BubbleSort();

        System.out.println("Original Marks:");
        sorter.printArray(marks);

        // Perform Bubble Sort
        sorter.bubbleSort(marks);

        System.out.println("Sorted Marks:");
        sorter.printArray(marks);
    }
}
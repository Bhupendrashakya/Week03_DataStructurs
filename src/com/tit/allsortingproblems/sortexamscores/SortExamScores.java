package com.tit.allsortingproblems.sortexamscores;

// Creating a class SortExamScores to demonstrate the Selection Sort algorithm
class SortExamScores
{
    public static void main(String[] args) {
        // Array of exam scores
        int[] scores = {85, 96, 78, 65, 92, 88, 33,99,88,45,39,41,42,65,73};

        // Create an instance of SelectionSort
        SelectionSort sorter = new SelectionSort();

        System.out.println("Original Exam Scores:");
        sorter.printArray(scores);

        // Perform Selection Sort
        sorter.selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        sorter.printArray(scores);
    }
}

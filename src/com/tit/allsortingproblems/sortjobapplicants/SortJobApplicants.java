package com.tit.allsortingproblems.sortjobapplicants;

public class SortJobApplicants {
    // Creating a class SortJobApplicants to demonstrate the Heap Sort algorithm

        public static void main(String[] args)
        {
            // Array of salary demands
            int[] salaries = {50000,44666,64469,46413,446485,44977,13553,36464, 70000, 40000, 60000, 80000, 30000};

            // Create an instance of HeapSort
            HeapSort sorter = new HeapSort();

            System.out.println("Original Salary Demands:");
            sorter.printArray(salaries);

            // Perform Heap Sort
            sorter.sort(salaries);

            System.out.println("Sorted Salary Demands:");
            sorter.printArray(salaries);
        }
    }



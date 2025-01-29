package com.tit.day1linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList(4); // Setting time quantum to 4

        // Adding some processes to the circular list
        list.addProcess(1, 10, 1);
        list.addProcess(2, 5, 2);
        list.addProcess(3, 8, 1);
        list.addProcess(4, 6, 3);

        // Simulating round-robin scheduling
        System.out.println("Simulating Round Robin Scheduling:");
        list.simulateRoundRobin();

        // Removing a process by Process ID after execution
        System.out.println("\nRemoving Process with ID 2:");
        list.removeProcessById(2);
        list.displayProcessList();
    }
}

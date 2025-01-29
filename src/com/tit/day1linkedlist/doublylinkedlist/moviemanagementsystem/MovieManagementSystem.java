package com.tit.day1linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.deleteMovie("gadar");
        dll.addAtStart("gadar","raja",7.5,2024);
        dll.addAtStart("good news","akshay",5.5,2023);
        dll.addAtStart("salar","raja",9.5,2023);
        dll.addAtStart("pushpa","allu",8.5,2025);
        dll.addAtStart("your fault","nick",6.5,2024);

        //dll.displayAllRecords();
        dll.addAtLast("Sanam teri kasam","hero",9.0,2012);
          dll.displayAllRecordsReverce();
    }
}

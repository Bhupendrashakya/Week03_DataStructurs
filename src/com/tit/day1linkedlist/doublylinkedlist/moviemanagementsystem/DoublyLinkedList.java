package com.tit.day1linkedlist.doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;

public class DoublyLinkedList {

   static class Node{
        String title;
        String director;
        double rating;
        int year;
        Node next;
        Node prev;


        public Node(String title, String director, double rating, int year) {
            this.title = title;
            this.director = director;
            this.rating = rating;
            this.year = year;
            this.next = null;
            this.prev = null;
        }
    }

   static Node Head;
  static  Node tail;
    Scanner sc=new Scanner(System.in);
    public void addAtLast(String title, String director,double rating,int year){
        Node newNode=new Node(title,director,rating,year);
        if(Head==null){
            Head=newNode;
            tail=Head;
            return;
        }
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        tail=newNode;
    }
    public void addAtStart(String title, String director,double rating,int year){
        Node newNode=new Node(title,director,rating,year);
        if(Head==null){
            Head=newNode;
            tail=Head;
            return;
        }
      //Aa  tail=Head;
        newNode.next=Head;
        Head.prev=newNode;
        Head=newNode;
        Node temp=Head;
        while (temp.next!=null){
            temp=temp.next;
        }
        tail=temp;

    }
    public void searchMovie(String s){
        if(Head==null){
            System.out.println("List is empty, There is no Movie !");
            return;
        }
        Node temp=Head;
        while(temp!=null)
        {
            if(temp.director.equalsIgnoreCase(s)) {
                System.out.println("Here is the details of movie :");
                System.out.println("Title: " + temp.title + "  rating: " + temp.rating + " director: " + temp.director + " year: " + temp.year);
                return;
            }
            temp = temp.next;
        }
        System.out.println("No match found in record !");
    }
    public void deleteMovie(String title) {
        if (Head == null) {
            System.out.println("List is empty, There is no movie !");
            return;
        }
        if(Head.title.equalsIgnoreCase(title)){
            if (Head.next!=null){
                Head=Head.next;
                System.out.println("Movie record is deleted !");
            }
        }
        Node temp = Head;
        while (temp.next != null) {
            if (temp.next.title.equalsIgnoreCase(title)) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                    System.out.println("Movie record has been deleted !");
                } else if (temp.next != null) {
                    temp.next = null;
                } else {
                    System.out.println("No match found in record !");
                }
            }
            temp = temp.next;
        }
    }
    public void updateStudentGrade(String title){
        if(Head==null){
            System.out.println("List is empty, There is no movie !");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                System.out.println("Enter the new rating for Movie :");
                temp.rating=sc.nextDouble();
                System.out.println("Rating is updated for movie!");
                break;
            }else{
                System.out.println("No match found in record !");
            }
        }
    }
    public void displayAllRecords(){
        if(Head==null){
            System.out.println("List is empty, There is no Movie !");
            return;
        }
        Node temp=Head;
        System.out.println("Here is all the movies  present in record :");
        while(temp!=null){
            System.out.println("Title: " + temp.title + "  rating: " + temp.rating + " director: " + temp.director + " year: " + temp.year);
            temp=temp.next;
        }
    }
    public void displayAllRecordsReverce(){
        if(tail==null){
            System.out.println("List is empty, There is no Movie !");
            return;
        }
        Node temp=tail;
        System.out.println("Here is all the movies  present in record :");
        while(temp!=null){
            System.out.println("Title: " + temp.title + "  rating: " + temp.rating + " director: " + temp.director + " year: " + temp.year);
            temp=temp.prev;
        }
    }

    public void addAtPosition(int position, String title, String director,double rating, int year) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addAtStart(title,director,rating,year);
        } else {
            Node newNode = new Node(title,director,rating,year);
            Node temp = Head;
            for (int i = 1; temp != null && i < position; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of bounds");
            } else {
                newNode.next = temp.next;
                newNode.prev=temp;
                temp.next = newNode;
            }
        }
    }
}

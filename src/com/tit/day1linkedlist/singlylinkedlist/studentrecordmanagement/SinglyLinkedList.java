package com.tit.day1linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class SinglyLinkedList {
    class Node{
        String name;
        String roll;
        int age;
        char grade;
        Node next;

        public Node(String name, String roll, int age, char grade) {
            this.name = name;
            this.roll = roll;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    Node Head;
    Scanner sc=new Scanner(System.in);
    public void addStudentAtLast(String name, String roll,int age, char grade){
        Node newNode=new Node(name,roll,age,grade);
        if(Head==null){
            Head=newNode;
            return;
        }
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addStudentAtStart(String name, String roll,int age, char grade){
        Node newNode=new Node(name,roll,age,grade);
        if(Head==null){
            Head=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
    }
    public void searchStudent(String s){
        if(Head==null){
            System.out.println("List is empty, There is no Student !");
            return;
        }
        Node temp=Head;
        while(temp!=null)
        {
            if(temp.roll.equalsIgnoreCase(s)) {
                System.out.println("Here is the details of Student :");
                System.out.println("name: " + temp.name + "  age: " + temp.age + " roll: " + temp.roll + " grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("No match found in record !");
    }
    public void deleteStudent(String roll) {
        if (Head == null) {
            System.out.println("List is empty, There is no Student !");
            return;
        }
        if(Head.roll.equalsIgnoreCase(roll)){
            if (Head.next!=null){
                Head=Head.next;
                System.out.println("Student record is deleted !");
            }
        }
        Node temp = Head;
        while (temp.next != null) {
            if (temp.next.roll.equalsIgnoreCase(roll)) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                    System.out.println("Student record has been deleted !");
                } else if (temp.next != null) {
                    temp.next = null;
                } else {
                    System.out.println("No match found in record !");
                }
            }
            temp = temp.next;
        }
    }
    public void updateStudentGrade(String roll){
        if(Head==null){
            System.out.println("List is empty, There is no Student !");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            if(temp.roll.equalsIgnoreCase(roll)){
                System.out.println("Enter the new grade for student :");
                String str=sc.next();
                temp.grade=str.charAt(0);
                System.out.println("Grade is updated for student!");
                break;
            }else{
                System.out.println("No match found in record !");
            }
        }
    }
    public void displayAllRecords(){
        if(Head==null){
            System.out.println("List is empty, There is no Student !");
            return;
        }
        Node temp=Head;
        System.out.println("Here is all the students present in record :");
        while(temp!=null){
            System.out.println("name: "+temp.name +"  age: "+ temp.age+ " roll: "+temp.roll+" grade: "+ temp.grade);
            temp=temp.next;
        }
    }

    public void addAtPosition(int position, String name, String roll,int age, char grade) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addStudentAtStart(name,roll,age,grade);
        } else {
            Node newNode = new Node(name,roll, age, grade);
            Node temp = Head;
            for (int i = 1; temp != null && i < position; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of bounds");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }
}

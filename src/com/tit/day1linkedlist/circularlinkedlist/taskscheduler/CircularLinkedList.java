package com.tit.day1linkedlist.circularlinkedlist.taskscheduler;
public class CircularLinkedList {

    // Node class representing each task in the circular linked list
    static class Node {
        String taskId;
        String name;
        int priority;
        String date;
        Node next;

        // Constructor to initialize a task node
        public Node(String taskId, String name, int priority, String date) {
            this.taskId = taskId;
            this.name = name;
            this.priority = priority;
            this.date = date;
            this.next = null;
        }
    }

    // Head node to keep track of the beginning of the list
    static Node Head;
    // Current node to keep track of the current task
    static Node current;


    // Method to add a task at the end of the circular linked list
    public void addAtLast(String taskId, String name, int priority, String year) {
        Node newNode = new Node(taskId, name, priority, year);
        if (Head == null) {
            Head = newNode;
            newNode.next = Head; // Make it circular
        }
        else {
            Node temp = Head;
            while (temp.next != Head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = Head; // Make it circular
        }
    }

    // Method to add a task at the beginning of the circular linked list
    public void addAtStart(String taskId, String name, int priority, String year) {
        Node newNode = new Node(taskId, name, priority, year);
        if (Head == null) {
            Head = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    // Method to search for a task by priority
    public void searchTask(int priority) {
        boolean flag=true;
        if (Head == null) {
            System.out.println("List is empty, There is no Task !");
            return;
        }
        Node temp = Head;

        do{
            if (temp.priority == priority) {
                System.out.println("Here is the details of the Task:");
                System.out.println("Name: " + temp.name + " | ID: " + temp.taskId + " | Priority: " + temp.priority + " | Year: " + temp.date);
                flag=false;
            }
            temp = temp.next;
        }
        while (temp != Head) ;
        if(flag)System.out.println("No match found in record !");
    }

    // Method to delete a task by Task ID
    public void deleteTask(String taskId) {
        if (Head == null) {
            System.out.println("List is empty, There is no Task !");
            return;
        }
        if (Head.taskId.equalsIgnoreCase(taskId)) {
            if (Head.next != null) {
                Head = Head.next;
                System.out.println("Task record is deleted !");
                return;
            }
        }
        Node temp = Head;
        while (temp.next != Head) {
            if (temp.next.taskId.equalsIgnoreCase(taskId)) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                    System.out.println("Task record has been deleted !");
                } else if (temp.next != null) {
                    temp.next = null;
                } else {
                    System.out.println("No match found in record !");
                }
            }
            temp = temp.next;
        }
    }

    // Method to view the current task and move to the next task
    public Node viewAndMoveToNextTask() {
        if (current == null) {
            current = Head;
            System.out.println("Current task in scheduler is :");
            System.out.println("Name: " + current.name + " | ID: " + current.taskId + " | Priority: " + current.priority + " | Year: " + current.date);


        } else {
            current = current.next;
        }
        return current;
    }

    // Method to display all tasks starting from the Head node
    public void displayAllTasks() {
        if (Head == null){
            System.out.println("Task scheduler is empty !");
            return;
        }

        Node temp = Head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.name +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.date);
            temp = temp.next;
        } while (temp!= Head);
    }

    // Method to add a task at a specific position in the circular linked list
    public void addAtPosition(int position, String taskId, String name, int priority, String year) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addAtStart(taskId, name, priority, year);
        } else {
            Node newNode = new Node(taskId, name, priority, year);
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

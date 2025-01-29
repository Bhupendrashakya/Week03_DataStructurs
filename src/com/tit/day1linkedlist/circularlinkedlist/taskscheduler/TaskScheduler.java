package com.tit.day1linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
     //   cll.displayAllTasks();
        cll.addAtLast("ts101","food",5,"29-01-2025");
        cll.addAtLast("ts102","code",9,"29-01-2025");
        cll.addAtLast("ts103","water",8,"29-01-2025");
        cll.addAtLast("ts104","punch",10,"29-01-2025");
        cll.addAtLast("ts105","tea",5,"29-01-2025");
        cll.addAtLast("ts106","alarm",10,"29-01-2025");
        cll.viewAndMoveToNextTask();
        cll.displayAllTasks();
        cll.deleteTask("ts106");
        cll.displayAllTasks();
        cll.searchTask(10);

    }

}

package com.tit.day1linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagment {

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.displayAllRecords();
        sll.addStudentAtLast("karan","cg101",25,'D');
        sll.addStudentAtLast("Gourav","cg102",22,'B');
        sll.addStudentAtLast("Bhupendra","cg103",21,'A');
        sll.addStudentAtLast("Nikhil","cg104",20,'C');
        sll.displayAllRecords();
        sll.addStudentAtStart("gagan","cg105",27,'A');
        sll.updateStudentGrade("cg105");
        sll.displayAllRecords();
        sll.searchStudent("cg103");
        sll.deleteStudent("cg101");
        sll.displayAllRecords();
        sll.addAtPosition(3,"Ayush","cg107",17,'B');
        sll.displayAllRecords();
    }
}

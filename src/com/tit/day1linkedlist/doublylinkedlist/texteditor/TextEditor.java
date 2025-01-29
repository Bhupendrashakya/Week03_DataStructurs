package com.tit.day1linkedlist.doublylinkedlist.texteditor;

public class TextEditor {
    public static void main(String[] args) {
        DoublyLinkedList editor = new DoublyLinkedList(10); // History size limited to 10 states

        // Adding text states
        editor.addTextState("Hello");
        editor.addTextState("Hello, World");
        editor.addTextState("Hello, World!");

        // Display current state
        System.out.println("Displaying current state:");
        editor.displayCurrentState();

        // Perform undo operations
        System.out.println("\nPerforming undo:");
        editor.undo();
        editor.undo();

        // Perform redo operation
        System.out.println("\nPerforming redo:");
        editor.redo();

        // Add more states
        System.out.println("\nAdding new states:");
        editor.addTextState("Hello, Java!");
        editor.displayCurrentState();

        // Undo beyond the oldest state
        System.out.println("\nUndo beyond the oldest state:");
        editor.undo();
        editor.undo();
        editor.undo();
    }
}

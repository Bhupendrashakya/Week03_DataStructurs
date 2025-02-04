package com.tit.stringbuilder.reversestringusingstringbuilder; // Package declaration

import java.util.Scanner; // Importing the Scanner class for user input

public class main { // Main class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        ReverseString rev = new ReverseString(); // Creating an instance of ReverseString

        // Prompting the user to enter a string to reverse
        System.out.println("Enter a string to reverse :");
        String userString = sc.next(); // Reading user input as a string

        // Reversing the user input string and displaying the result
        System.out.println("String after reverse: " + rev.reverse(userString));
    }
}

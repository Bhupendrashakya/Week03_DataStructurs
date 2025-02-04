package com.tit.stringbuilder.reversestringusingstringbuilder; // Package declaration

public class ReverseString { // Class to reverse a string

    // Method to reverse the input string
    public String reverse(String string) {
        StringBuilder sb = new StringBuilder(); // Creating a StringBuilder object
        sb.append(string); // Appending the input string to the StringBuilder
        sb.reverse(); // Reversing the string using StringBuilder's reverse method
        return sb.toString(); // Converting the StringBuilder back to a string and returning it
    }
}

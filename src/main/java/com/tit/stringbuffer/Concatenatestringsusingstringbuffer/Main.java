package com.tit.stringbuffer.Concatenatestringsusingstringbuffer;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the ConcatenateStrings class
        ConcatenateStrings ct = new ConcatenateStrings();

        // Array of strings to concatenate
        String[] stringArr = {"Karan", "Bhupendra", "Gourav", "Nikhil"};

        // Print the concatenated string to the console
        System.out.println(ct.concate(stringArr).toString());
    }
}

package com.tit.stringbuffer.Concatenatestringsusingstringbuffer;

public class ConcatenateStrings {
    // Method to concatenate an array of strings into a single string
    public String concate(String[] str){
        // Initialize a StringBuffer to store the concatenated result
        StringBuffer sb = new StringBuffer();

        // Loop through each string in the array
        for (int i = 0; i < str.length; i++){
            // Append each string to the StringBuffer
            sb.append(str[i]);
        }

        // Convert the StringBuffer to a string and return it
        return sb.toString();
    }
}

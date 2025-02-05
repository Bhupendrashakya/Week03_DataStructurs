package com.tit.stringbuffer.concatestringsusingstringbuffer;

// Importing necessary classes from other packages
import com.tit.stringbuffer.Concatenatestringsusingstringbuffer.ConcatenateStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcateString {
    // Test method to verify the concatenate functionality
    @Test
    public void test1(){
        // Creating an instance of ConcatenateStrings class
        ConcatenateStrings ct = new ConcatenateStrings();

        // Array of strings to concatenate
        String[] stringArr = {"Karan", "Bhupendra", "Gourav", "Nikhil"};

        // Concatenating the strings in the array
        String str = ct.concate(stringArr);

        // Asserting that the concatenated string matches the expected result
        assertEquals("KaranBhupendraGouravNikhil", str);
    }
}

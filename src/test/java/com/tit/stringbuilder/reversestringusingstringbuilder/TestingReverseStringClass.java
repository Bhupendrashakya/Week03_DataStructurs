package com.tit.stringbuilder.reversestringusingstringbuilder; // Package declaration

import com.tit.stringbuilder.reversestringusingstringbuilder.ReverseString; // Importing the ReverseString class
import org.junit.jupiter.api.Test; // Importing the JUnit test annotation
import static org.junit.jupiter.api.Assertions.*; // Importing static assertions from JUnit

// Class for testing the ReverseString class
public class TestingReverseStringClass {

    // Test method to test the reverse method
    @Test
    public void test1() {
        ReverseString rev = new ReverseString(); // Creating an instance of ReverseString
        String str = rev.reverse("Gaurav"); // Calling the reverse method with input "Gaurav"
        assertEquals("varuag", str); // Asserting that the reversed string is "varuag"
    }

}

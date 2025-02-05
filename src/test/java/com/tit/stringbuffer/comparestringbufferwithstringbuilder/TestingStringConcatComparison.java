package com.tit.stringbuffer.comparestringbufferwithstringbuilder;

// Importing necessary libraries for testing and assertions
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingStringConcatComparison {
    // Defining the number of strings for concatenation
    int numStrings = 1000000;
    // Defining a string to be concatenated
    String str = "hello";

    @Test
    public void Test1(){
        // Creating an instance of StringConcatComparison class
        StringConcatComparison comparison = new StringConcatComparison();

        // Measuring the time taken for concatenation using StringBuffer
        long durationStringBuffer = comparison.concatenationStringBuffer();

        // Measuring the time taken for concatenation using StringBuilder
        long durationStringBuilder = comparison.concatenationStringBuilder();

        // Asserting that the durations for both StringBuffer and StringBuilder are equal
        assertEquals(durationStringBuffer, durationStringBuilder);
    }
}

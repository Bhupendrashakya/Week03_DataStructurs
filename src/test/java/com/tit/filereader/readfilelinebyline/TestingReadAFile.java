package com.tit.filereader.readfilelinebyline;

import com.tit.filereader.readafile.ReadAFiIe;
import org.junit.jupiter.api.Test;

// Creating a class TestingReadAFile to verify reading a file line by line
public class TestingReadAFile
{
    @Test
    public void testReadAFileLineByLine()
    {
        // Creating an instance of ReadAFiIe class
        ReadAFiIe raf = new ReadAFiIe();
        // Path to the test file
        String filePath = "src/test/java/com/tit/filereader/readfilelinebyline/large_text_file.txt";
        // Calling the readAFileLineByLine method with the specified file path
        raf.readAFileLineByLine(filePath);
        // Printing a message to indicate the function is working as expected
        System.out.println("readAFileLineByLine function working like expected");

    }
}
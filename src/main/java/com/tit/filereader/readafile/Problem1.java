package com.tit.filereader.readafile;

/*
FileReader Problem 1: Read a File Line by Line Using FileReader
Problem:
Write a program that uses FileReader to read a text file line by line and print each line to the console.
Approach:
- Create a FileReader object to read from the file.
- Wrap the FileReader in a BufferedReader to read lines efficiently.
- Use a loop to read each line using the readLine() method and print it to the console.
- Close the file after reading all the lines.
*/

// Creating a class Problem1 to demonstrate the ReadAFiIe functionality
public class Problem1
{
    public static void main(String[] args)
    {
        // Create an instance of ReadAFiIe
        ReadAFiIe reader = new ReadAFiIe();

        // Specify the file path
        String filePath = "src/main/java/com/tit/filereader/readafile/large_text_file.txt";

        // Read the file line by line using the ReadAFiIe class
        reader.readAFileLineByLine(filePath);
    }
}

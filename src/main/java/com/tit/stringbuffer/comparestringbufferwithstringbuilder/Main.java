package com.tit.stringbuffer.comparestringbufferwithstringbuilder;
//creating main class to use StringConcatComparison class for comparison
public class Main {
    public static void main(String[] args) {
        // creating object of StringConcatComparison for call the compare() method
        StringConcatComparison comparison=new StringConcatComparison();
        // calling compare() method to compare
        comparison.concatenationStringBuffer();
        comparison.concatenationStringBuilder();
    }
}

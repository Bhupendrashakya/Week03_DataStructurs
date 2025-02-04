package com.tit.stringbuilder.removeduplicatefromstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RemoveDuplicate rd=new RemoveDuplicate();
        System.out.println("Enter a string containing duplicate characters :");
        String usreString =sc.next();
        System.out.println("After removing duplicate characters : "+rd.removeDuplicate(usreString));
    }
}

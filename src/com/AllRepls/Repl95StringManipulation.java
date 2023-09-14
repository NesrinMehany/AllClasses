package com.AllRepls;

import java.util.Scanner;

public class Repl95StringManipulation {

//    **For you to do:**
//
//    Using Scanner class input string value.
//
//    Print out the following: "The first 3 letters of \_\_\_ is ___"
//
//            ```
//    For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
//            ```

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String input = sc.next();
String F3L="";

        for(int i=0;i<3; i++){
            F3L+= input.charAt(i);

        }
        System.out.println("the first 3 letters of "+ input +" is "+F3L);
    }
}

package com.AllRepls;

public class Repl103StringManipulation {
//    Given the following inputs:
//
//            ```
//    String s;
//```
//
//    Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
//
//    Sample input/outputs:
//
//            ```
//    In: hello
//    h e l l o
//```
//
//        ```
//    In: covert
//```
//
//        ```
//    c o v e r t
//```
//
//        ```
//    In: blasphemy
//```
//
//        ```
//    b l a s p h e m y
//```
public static void main(String[] args) {
    String s = "covert";
    //write your code below
    for (int i = 0; i < s.length(); i++) {
        System.out.print(s.charAt(i)+" ");
    }
}
}

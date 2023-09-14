package com.AllRepls;

public class Repl90StringManipulation {
//    **For you to do:**
//
//    Create a String named s1 = "hello"  check weather string is empty or not
//
//    Create a String named s2 = ""  check weather string is empty or not
//
//**Expected Output:**
//
//            ```
//            false
//            ```
//
//            ```
//            true
//            ```

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "";

        boolean isEmpty;
        if (s1.isEmpty()) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        System.out.println(isEmpty);

    }
}
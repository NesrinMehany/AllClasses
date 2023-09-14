package com.AllRepls;

import java.util.Scanner;

public class Repl21SccannerClass {

    /***For you to do:**

     Write a program that asks the user's age: "Enter your age  "

     Then display it by adding 10 (i.e age + 10) in your final output.

     **Example Output:**

     ```
     Enter your age 30
     Your age after 10 years is 40
     ```*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr your age");
        int age = scan.nextInt();
        System.out.println(age + 10);
    }
     }

package com.AllRepls;

import java.util.Scanner;

public class Repl20ScannerClass {

    //**For you to do:**
    //
    //Write  a program that takes user's first name and last name and prints in console
    //
    //Instruct the user to enter first name: "Please Enter First Name"
    //
    //Capture the first name
    //
    //Instruct the user to enter last name:"Please Enter Last Name"
    //
    //Capture last name
    //
    //Print first name and last name
    //
    //**Final Output:**
    //
    //```
    //Example:
    //```
    //
    //```
    //Please Enter First Name
    //```
    //
    //```
    //Please Enter Last Name
    //```
    //
    //```
    //Cindy Crawford



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enetr First Name");

        String firstName= scan.next();

        System.out.println("please enter Last name");
        String LastName= scan.next();

        System.out.println(firstName +" "+  LastName);

    }



}

package com.AllRepls;

import java.util.Scanner;

public class Repl104StringManipulation {
    //    **For you to do:**
//
//    Create an array of names that will hold 5 String elements.
//
//    Names must be taking from a user.
//
//    Print out the first three characters of each element of the array, one per line.
//
//    Note: every array element must be at least 3 characters long.
//
//    Input Example:
//
//    John
//
//            Jane
//
//    Jimmy
//
//            Mike
//
//    Emily
//
//```
//    Expected Output:
//            ```
//
//            **Joh**
//
//            **Jan**
//
//            **Jim**
//
//            **Mik**
//
//            **Emi**
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 5 names");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }

        for (String name : names) {
            for (int i = 0; i < 3; i++)
                System.out.print(name.charAt(i));
            System.out.println();
        }
    }
}

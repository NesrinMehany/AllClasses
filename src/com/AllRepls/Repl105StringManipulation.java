package com.AllRepls;

import java.util.Scanner;
//**For you to do:**
//
//        There is a code that takes input as a String.
//
//        Write a program that will print out only vowels of that string
//
//        Sample input/outputs:
//
//        ```
//        In: howdyho
//        oo
//        ```
//
//        ```
//        In: huehuehuehue
//        ueueueue
//        ```
//
//        ```
//        In: poopoo what idk what im doing
//        ooooaiaioi
//        ```
public class Repl105StringManipulation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        char[] vowels= {'a','i','u','o','e'};

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<vowels.length; j++){
                if(word.charAt(i)==vowels[j]){
                    System.out.print(vowels[j]);}
            }
        }
    }
}

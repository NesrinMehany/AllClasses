package com.AllRepls;

public class Repl92StringManipulation {
//    **For you to do:**
//
//    Validate if the string ends with "u" prints the boolean value accordingly.
//
//            Validate if the string ends with "world" prints the boolean value accordingly.
//
//            Validate if the string ends with "are" prints the boolean value accordingly.
//
//            Validate if the string ends with "you" prints the boolean value accordingly.
public static void main(String[] args) {
    String s1="hello how are you";
    String[] words = {"u", "world", "are", "you"};
    for(String word:words) {
        System.out.println(  s1.endsWith(word));
    }
}

}

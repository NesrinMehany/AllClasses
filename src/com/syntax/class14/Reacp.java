package com.syntax.class14;

import java.util.Arrays;

public class Reacp {
    public static void main(String[] args) {
        String str = "kfdkjKJKJKr4343%$%$@*&";
        System.out.println(str.replaceAll("[^a-z]", ""));
        System.out.println(str.replaceAll("[A-z0-9]", ""));
        System.out.println(str.replaceAll("[^0-9]", ""));
        System.out.println(str.replaceAll("[^A-Z]", ""));
        String str1 = str.replaceAll("[^A-z]", "");

        String sentence = "Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing!";
        String[] split = sentence.split("[.?!]");
        for (String newString : split) {
            System.out.println(newString);

        }
        System.out.println("split = " + Arrays.toString(split));
        //alt+Enter will  give the suggestion what went wrong with code

        String str2 = "Batch 14 is Great.  Batch 14 is Great";
        String replace = str2.replace("Great", "Good");
        System.out.println(replace); //it replaces both great to good
        String replacefirst = str2.replaceFirst("Great", "Good");
        System.out.println(replacefirst);//It replaces only first great to good not the second one
    }
}
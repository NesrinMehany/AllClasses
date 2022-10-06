package com.syntax.class13;

import java.util.Scanner;

public class Tasks {




    public static void main(String[] args) {
         /*
    Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters,
    print the character in the middle of the String.
     */

        String str="hello";
        int length=str.length();
        if(!str.isEmpty()&&length%2!=0&&length>=3) {

            int middleIndex=length/2;
            System.out.println(str.charAt(middleIndex));
        }

        /*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String str2="Sunday";

        for(int i=str2.length()-1;i>=0;i--) {
            System.out.print(str2.charAt(i));
        }
        System.out.println();
        char [] charArr=str2.toCharArray();

        for(int i=charArr.length-1;i>=0;i--) {
            System.out.print(charArr[i]);
        }

        /*
         * Write a program that reads the first name of mother and father
         *  if they expecting boy
         * or girl? Based on the input suggests a name for a baby: Example Output: Mom's
         * first name? Mary Dad's first name? Daniel Boy or Girl? boy Suggested baby
         * name: DANRY
         *
         * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
         * girl Suggested baby name: MAIEL
         */
        String motherName;
        String fatherName;
        String babyType;
        String firstHalf;
        String secondHalf;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the name of mother");
        motherName=scanner.next();
        System.out.println("Please Enter the name of father");
        fatherName=scanner.next();
        System.out.println("Are you expecting a boy or girl boy=true girl=false");
        babyType=scanner.next();

        if(babyType.equals("boy")) {
            firstHalf=fatherName.substring(0,fatherName.length()/2);
            secondHalf=motherName.substring(motherName.length()/2);

        }else {
            firstHalf=motherName.substring(0,motherName.length()/2);
            secondHalf=fatherName.substring(fatherName.length()/2);

        }
        System.out.println(firstHalf+secondHalf);
    }

}

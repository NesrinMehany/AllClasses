package com.AllRepls;

public class Repl100Stringmanipulation {
//    Given the following inputs:
//
//            ```
//    String s;
//```
//
//    Write a for loop that will print out the reverse of the string.
//
//
//    Sample input/outputs:
//
//            ```
//    In: manhattan
//```
//
//        ```
//    nattahnam
//```
//
//        ```
//    In: processor
//```
//
//        ```
//    rossecorp
//```
//
//        ```for
//    In: racecar
//```
//
//        ```
//    racecar
//```

    public static void main(String[] args) {
       String input= "Processor";
       String newInput="";
        for(int i=input.length()-1; i>=0; i--){
            newInput+=input.charAt(i);
        }
        System.out.println(newInput);
    }
}

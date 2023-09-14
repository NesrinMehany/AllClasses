package com.AllRepls;

public class Repl101StringManipulation {
//    Inputs:
//
//            ```
//    String word;
//```
//
//    Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.
//
//
//    Sample input/outputs
//
//```
//    In: hello
//            hlo
//```
//
//        ```
//    In: SSyynnttaaxxTTeecchhnnoollooggiieess
//            SyntaxTechnologies
//```

    public static void main(String[] args) {
        String word = "SSyynnttaaxxTTeecchhnnoollooggiieess";
        //write your code below
        String newWord="";
        for(int i=0;i<word.length(); i+=2){
            newWord+= word.charAt(i);
        }
        System.out.print(newWord);
    }
}

package com.AllRepls;

public class Repl69NestedForLoop {
    /***For you to do:**

     Write a program to print out the pattern:

     **Expected output:**

     ```
     1 2 3 4 5 6 7
     ```

     ```
     1 2 3 4 5 6
     ```

     ```
     1 2 3 4 5
     ```

     ```
     1 2 3 4
     ```

     ```
     1 2 3
     ```

     ```
     1 2
     ```

     ```
     1
     ```

     ```
     1 2
     ```

     ```
     1 2 3
     ```

     ```
     1 2 3 4
     ```

     ```
     1 2 3 4 5
     ```

     ```
     1 2 3 4 5 6
     ```

     ```
     1 2 3 4 5 6 7
     ```*/
    public static void main(String[] args) {
       for(int i=7; i>0; i--){
           for(int x=1; x<=i; x++){
               System.out.print(x+" ");
           }
           System.out.println(" ");
       }

       for(int i=2; i<=7; i++){
           for(int x=1; x<=i; x++){
               System.out.print(x+" ");
           }
           System.out.println(" ");
       }

    }
}

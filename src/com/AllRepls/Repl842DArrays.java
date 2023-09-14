package com.AllRepls;

public class Repl842DArrays {
    /***For you to do:**

     Write a program that prints the total number of elements that are negative AND odd

     **Output:**
     for example -3 is both negative and odd

     ```
     3
     ```*/
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int counter=0;
        for(int i=0; i<a.length; i++){
            for(int x =0; x<a[i].length; x++){
                if(a[i][x]%2!=0 && a[i][x]<0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

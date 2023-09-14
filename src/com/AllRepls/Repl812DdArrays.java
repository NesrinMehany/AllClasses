package com.AllRepls;

public class Repl812DdArrays {/***For you to do:**

 Write a program that prints the highest value in the array.

 **Expected Output:**
 input [5,4,8]

 ```
 8
 ```*/

public static void main(String[] args) {
    int[] a= {5,4,8,3,100,95};
    int largest= a[0];

    for(int i=0; i<a.length; i++){
        if(a[i]>largest){
            largest=a[i];
        }
    }
    System.out.println(largest
    );
}
}

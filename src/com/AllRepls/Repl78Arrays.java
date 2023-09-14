package com.AllRepls;

import java.util.Scanner;

public class Repl78Arrays {
    /***For you to do:**

     Create an int array of integers with a size of 5 and input values with Scanner.

     Don't print prompt questions for a user.

     Using loop print out each element of the array that should look like the output below
     **Example:**

     Input:

     1

     2

     3

     4

     5

     ```
     Output:
     ```

     ```
     10
     ```

     ```
     20
     ```

     ```
     30
     ```

     ```
     40
     ```

     ```
     50
     ```*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt()*10;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j] );
        }
    }


}

package com.AllRepls;

import java.util.Scanner;

public class Repl22ScannerClass {
/***For you to do:**

 Write a program to take user name, age and mobile number

 First Output: "Enter your name"

 Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)

 Third Output: "  ge"

 **Example Output:**

 ```
 Enter your name
 ```

 ```
 Enter your mobile number
 ```

 ```
 Enter your age
 ```

 ```
 Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
 ```
*/

public static void main(String[] args) {
    System.out.println(" Enter your name");
    Scanner scan = new Scanner (System.in);
    String name = scan.next();
    System.out.println("enter you age ");
    int age= scan.nextInt();
    System.out.println("Enter your mobile number, please use (xxx-xxx-xxxx format)");
    String phone = scan.next();

    System.out.println(" your name is  "+ name + ", your age is "+ age + " and your mobile number is "+ phone );

}
 }

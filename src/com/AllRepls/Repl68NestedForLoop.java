package com.AllRepls;

public class Repl68NestedForLoop {
/***For you to do:**

 Write a program to print out the pattern:

 **Expected output:**

 ```
 $$$$
 ```

 ```
 $  $
 ```

 ```
 $  $
 ```

 ```
 $$$$
 ```*/

public static void main(String[] args) {
for(int i=0;i<4; i++){
    for(int x=0; x<4; x++){
        System.out.print("$");
        if(i==1 || i==2){
            System.out.print("  ");
            x+=2;
        }
    }
    System.out.println("");
}
}

}

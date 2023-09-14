package com.AllRepls;

public class Repl70Arrays {
    /*
    * **For you to do:**

Write a program that creates an array of integers and stores the following values: 45, 78, 12,  67, 55 and then prints all array values.

```
**Output:**
```

```
45 78 12 67 55
```*/

    public static void main(String[] args) {
        int[] numbers= {45, 78, 12,  67, 55};

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}

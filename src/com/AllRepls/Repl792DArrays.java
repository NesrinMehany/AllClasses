package com.AllRepls;

public class Repl792DArrays {/*
**For you to do:**

Write a program to print values from a 2D array

**Example Output:**

```
1.4 2.0 3.3 2.0
```

```
4.0 1.5 6.1 1.0
```

```
1.2 3.1 4.0 1.6
```*/

    public static void main(String[] args) {

            double[][] nums ={ { 1.4, 2.0, 3.3, 2.0 },
                    { 4.0, 1.5, 6.1, 1.0  },
                    { 1.2, 3.1, 4.0, 1.6 }};

            for(int i=0; i<nums.length; i++){
                for(int x=0; x<nums[i].length;x++){
                    System.out.print(nums[i][x]+" ");
                }
                System.out.println(" ");
            }
    }
}

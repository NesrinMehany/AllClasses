package com.AllRepls;

import java.util.Scanner;

public class Repl64ForLoop {
    /*
    * **For you to do:**

You should input:

```
int end;
```

  Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.

Each number should be on the same line, separated by a space.

 **Example Output:**

```
Int: 5
0 1 2 3 4 5 6 7 8 9
```

```
Int: 8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
```

```
In: -5
(no output)
```

  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0; i<x*2; i++)  {
            System.out.print(i+ " ");
        }
    }
}

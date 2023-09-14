package com.AllRepls;

public class repl73Arrays {/*
Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.

```
**Output:**
```

```
This is array of strings
```*/

    public static void main(String[] args) {
        String[]str={"This", "is", "array", "of", "strings"};

        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }
    }
}

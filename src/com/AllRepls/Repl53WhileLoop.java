package com.AllRepls;

public class Repl53WhileLoop {
    /*
    * **For you to do:**

Using do while loop print even numbers from 20 to 1

**Expected Output:**

```
20
```

```
18
```

```
16
```

```
14
```

```
12
```

```
10
```

```
8
```

```
6
```

```
4
```

```
2
```*/

    public static void main(String []args){
        int d = 20;
        while (d >= 2) {
            if (d % 2 == 0) {
                System.out.println(d );
            }
            d--;
        }
    }
}

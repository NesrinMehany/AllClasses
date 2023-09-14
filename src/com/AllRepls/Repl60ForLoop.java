package com.AllRepls;

public class Repl60ForLoop {
    /*
    * **For you to do:**

Write a program that prints the count down from 10 up to 1 and then says "Happy New Year!".

**Output:**

```
10
```

```
9
```

```
8
```

```
7
```

```
6
```

```
5
```

```
4
```

```
3
```

```
2
```

```
1
```

```
Happy New Year!
```*/
    public static void main(String[] args) {
        for(int i=10; i>=1;i--){
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
    }
}

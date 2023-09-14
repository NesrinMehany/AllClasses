package com.AllRepls;

public class Repl62ForLoop {
    /*
    * **For you to do:**

Using for loop Print 1 to 10 Numbers except 5 and 6

**Expected Output:**

```
1
```

```
2
```

```
3
```

```
4
```

```
7
```

```
8
```

```
9
```

```
10
```*/
    public static void main(String[] args) {

        for(int b=1; b<=10; b++)  {
            if(b==5 || b==6) {
                continue;
            }
            System.out.println(b);
        }
    }
}

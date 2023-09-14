package com.AllRepls;

import java.util.Scanner;

public class Repl44SwitchCase {
    /*
    * **For you to do:**

Prompt user with questions: "Please enter your favorite car make"

- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"



```
The output of your program should be:
```

```
"Your favorite car is ___"
```*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String favCar = scan.nextLine();
        String origin;

        switch (favCar) {

            case "BMW":
                origin = "german";
                break;
            case "Toyota":
                origin = "japanese";
                break;

            case "Maserati":
                origin = "italian";
                break;
            default:
                origin = "unknown";
                break;
        }
        System.out.println("Your favorite car is "+ origin + " car");
    }
}

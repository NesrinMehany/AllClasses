package com.AllRepls;

import java.util.Scanner;

public class Repl43SwitchCase {
    /*
    * **For you to do:**

Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.

case: 1 will display January

case: 12 will display December

Anything outside of 12 will display "Invalid"

**Example Output:**

```
Input a number between 1-12
```

```
Invalid
```

**Example Output:**

```
Input a number between 1-12
```

```
January
```*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String month;

        switch (num) {

            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;

            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";
                break;
        }
        System.out.println(month);
    }
}

package com.AllRepls;

public class Repl94StringManipulations {

//    **For you to do:**
//
//            - Create a String given="I love Java classes at Syntax"
//            - Retrieve 2 Strings using substring method from given String and print them
//
//**Expected Output:**
//
//            ```
//    classes at Syntax
//```
//
//        ```
//    I love Java
//```


    public static void main(String[] args) {
        String given= "I love Jave classes at syntax";
      String givenNew=   given.substring(given.indexOf("classes"));
      String firstHalf=  given.substring(0, given.indexOf("classes"));
        System.out.println(givenNew);
        System.out.println(firstHalf);
    }


}

package com.AllRepls;

public class Repl109JavaMethods {
//    For you to do
//
//            1. Create method name it as newLine
//
//2. Add print statement inside method body as "newLine method implementation"
//
//            3. Call newLine method three times
//
//**Expected Output:**
//
//            ```
//    newLine method implementation
//```
//
//        ```
//    newLine method implementation
//```
//
//        ```
//    newLine method implementation
//```


        void newLine(){
            System.out.println("newLine method implementation");
        }



        public static void main(String[] args) {
            Repl109JavaMethods m=new Repl109JavaMethods();
            for (int i=0; i<3;i++){
                m.newLine();
            }
        }
    }


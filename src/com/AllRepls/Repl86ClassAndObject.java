package com.AllRepls;

public class Repl86ClassAndObject {
//    Create a class 'Main' (please do not make it public as Repl will give you an error)
//
//    Inside class declare a String variable 'name' and integer variable 'roll_no'.
//
//    Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
//
//    Your program should print the following:
//
//            ```
//    Name is John and roll number is 2
//            ```

    public static void main(String[] args) {
        repl108JavaMethods m=new repl108JavaMethods();
        m.name= "John";
        m.roll=2;
        System.out.println(
                "Name is " + m.name + " and rollnumber is "+ m.roll
        );
    }
}
class repl108JavaMethods {
    String name;
    int roll;


}

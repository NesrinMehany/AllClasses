package com.AllRepls;

public class Repl106StringBuffer {
//    # For you to do
//
//    Instantiate and StringBuffer class
//
//    Append Value "Hello" to it
//
//    Append value "World" to it.
//
//    Print in UPPERCASE.
//
//**Expected Output:**
//
//            ```
//    HELLO WORLD
//```
public static void main(String[] args) {
    StringBuffer word = new StringBuffer("HELLO ");
    word.append("WORLD");
    System.out.println(word.toString().toUpperCase());

}
}

package com.syntax.class13;

public class StringMethodsTask6 {
    public static void main(String[] args) {
        /*How would you swap  2 strings without a temporary variable?*/
    String a= "string1";
    String b= "string2";
    a= a+b ;
    b=a.substring(0,a.length()/2);
    a=a.substring(a.length()/2);
        System.out.println("String a = " + a );
        System.out.println("String b = " +b );
    }
}

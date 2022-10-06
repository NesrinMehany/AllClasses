package com.syntax.Class16;

import HomeWork.ConstructorTask2;

public class Person {
    private String password="pass123";
    double salary=1000;

    public String name="Roman";

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);
        Bank bank=new Bank();

    }
}

class Bank{

    public static void main(String[] args) {
        // practicing constructors homework class 17
        ConstructorTask2 student5 = new ConstructorTask2("mark",60,70,50);

    }
}

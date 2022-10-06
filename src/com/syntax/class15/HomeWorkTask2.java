package com.syntax.class15;

public class HomeWorkTask2 {
      /*
    /Create a method that will take a number and prints whether the number is even or odd./
     */

    void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        HomeWorkTask2 task = new HomeWorkTask2();
        task.printEvenOdd(45);
        task.printEvenOdd(50);

    }
}
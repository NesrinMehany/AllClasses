package com.AllRepls;

public class Repl88ClasAndObj {
//    Create a Class Main
//
//    In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//
//    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
//    The output of the program should be as following:
//
//
//
//            ```
//    Husky can bark
//```
//
//        ```
//    Husky can run
//```
//
//        ```
//    Husky can play
//```

    public static void main(String[] args) {
        Main3 dog= new Main3 ();
        dog.breed= "Husky";
        dog.bark();
        dog.run();
        dog.play();

        Main3 puppy = new Main3();
        puppy.breed= "Bulldog";
        puppy.bark();
        puppy.run();
        puppy.play();

        Main3 pet = new Main3();
        pet.breed= "Labrador";
        pet.bark();
        pet.run();
        pet.play();
    }
}
class Main3 {
    String breed, name, color;

    void bark(){
        System.out.println(breed + " can bark");
    }
    void run(){
        System.out.println(breed + " can run");
    }
    void play(){
        System.out.println(breed + " can play");
    }
}

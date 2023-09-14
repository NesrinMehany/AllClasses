package com.AllRepls;

public class Repl87ClassAndObj {
//    **For you to do:**
//
//    Create a class named 'Main' with specific attributes.
//
//    Create two objects of that class in which you will be assigning the following values and then print them.
//
//    carColor='Black'
//
//    carYear=2019
//
//    carMake='BMW'
//
//    carColor='White'
//
//    carYear=2018
//
//    carMake='Toyota'
//
//            **Expected Output:**
//
//            ```
//    Car color is Black and car year is 2019 and car model is BMW
//    Car color is White and car year is 2018 and car model is Toyota
//```

    public static void main(String[] args) {
        Main2 car = new Main2();
        car.carColor = "Black";
        car.carYear = 2019;
        car.carMake="BMW";

        Main2 car2=new Main2();
        car2.carColor = "White";
        car2.carYear = 2018;
        car2.carMake="Toyota";

        System.out.println("Car color is "+ car.carColor +" and car year is " + car.carYear +  " and car model is " +car.carMake);
        System.out.println("Car color is "+ car2.carColor +" and car year is " + car2.carYear +  " and car model is " +car2.carMake);

    }}
class Main2 {
    String carColor;

    int carYear;

    String carMake;
}

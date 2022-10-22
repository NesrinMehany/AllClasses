package Projects;

public class Project2Task3 {
    public static void main(String[] args) {


       Car[] objs={new Sedan(50000,"Red",12), new Truck(60000, "Navy Blue", 2500)};
       for(Car obj:objs){
           obj.calculateSalePrice();
       }

    }
}

abstract class Car {
    double carPrice;
    String carColor;
    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
    abstract double calculateSalePrice();
}


class Sedan extends Car {
    double carLength;
    public Sedan(double carPrice, String carColor, double carLength) {
        super(carPrice, carColor);
        this.carLength = carLength;
    }

    @Override
    double calculateSalePrice() {
        double carSalePrice;
        if (carLength > 20) {
            carSalePrice = carPrice - (carPrice * 5 / 100);
            System.out.println("This car is eligible for 5% discount and your final sale price is " + carSalePrice);
        } else {
            carSalePrice = carPrice - (carPrice * 10 / 100);
            System.out.println("This car is eligible for 10% discount and your final sale price is " + carSalePrice);
        }

        return carSalePrice;
    }
}

class Truck extends Car {
    double weight;
    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        double carSalePrice;
        if (weight > 2000) {
            carSalePrice = carPrice - (carPrice * 10 / 100);
            System.out.println("This truck is eligible for 10% discount and your final sale price is " + carSalePrice);
        } else {
            carSalePrice = carPrice - (carPrice * 20 / 100);
            System.out.println("This truck is eligible for 20% discount and your final sale price is " + carSalePrice);
        }

        return carSalePrice;
    }
}
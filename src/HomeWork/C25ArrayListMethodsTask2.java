package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class C25ArrayListMethodsTask2 {
    //Task 2 Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>(6);
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");

        Iterator<String> it = drinks.iterator();
        for(int i=0; i< drinks.size();i++){
            String drink= it.next();
            if (drink.contains("a") || drink.contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "Water");

            }
        }
        System.out.println(drinks);
    }
}
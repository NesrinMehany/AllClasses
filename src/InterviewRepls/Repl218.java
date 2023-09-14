package InterviewRepls;

import java.util.*;

public class Repl218 {
    public static List<String> countRepeatation(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            int count = 0;
            for (int y = i + 1; y < items.size(); y++) {

                if (items.get(i).equalsIgnoreCase(items.get(y))) {
                    count++;
                    items.set(y, items.get(i) + count);

                }
            }
        }
        System.out.println(items);
        return items;
    }


    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");


        countRepeatation(items);
    }

}

//MIna
    /* public static void countRepetation(ArrayList<String> originalItems) {
         LinkedHashSet uniqueItemsSet = new LinkedHashSet(originalItems);
         ArrayList<String> uniqueItems = new ArrayList<>(uniqueItemsSet);
         ArrayList<String> expectedItems = new ArrayList<>();

         for (int i = 0; i < uniqueItems.size(); i++) {
             int counter = 0;

             for (int x = 0; x < originalItems.size(); x++) {
                 if (originalItems.get(x).equalsIgnoreCase(uniqueItems.get(i))) {
                     expectedItems.add(originalItems.get(x) + " " + counter);
                     counter++;
                 }
             }
         }
         System.out.println(expectedItems);

}*/

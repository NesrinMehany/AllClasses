package HomeWork;

import java.util.*;

class Repl209 {
    public static void main(String[] args) {


        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> apple = new LinkedHashMap<>();
        apple.put("Items", "Apple");
        apple.put("Price", 20.00);
        apple.put("Quantity", 10.0);


        Map<String, Object> orange = new LinkedHashMap<>();
        orange.put("Items", "Orange");
        orange.put("Price", 21.99);
        orange.put("Quantity", 10.0);

        dataList.add(apple);
        dataList.add(orange);

        double purchaseTotal = 0;

        for (Map<String, Object> eachFruitMap : dataList) {
            double price= (double) eachFruitMap.get("Price");
            double quantity= (double) eachFruitMap.get("Quantity");
            Object subtotal = price * quantity;
            purchaseTotal += (double)subtotal;
            eachFruitMap.put("SubTotal", subtotal);
            Set< Map.Entry<String, Object>>setOfDataEntriesOfEachMap=  eachFruitMap.entrySet();
            for (var entry : setOfDataEntriesOfEachMap) {
                System.out.print(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("  ");
            System.out.println("  ");
        }

        System.out.println("Your Purchase total : "+ purchaseTotal);
    }
}


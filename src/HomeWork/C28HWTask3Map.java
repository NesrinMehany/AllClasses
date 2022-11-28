package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C28HWTask3Map {
   /* Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.*/

    public static void main(String[] args) {
        HashMap<Long, String> bestBuy = new HashMap<>();
        bestBuy.put(1233455687L, "TV");
        bestBuy.put(515647896l, "Mac Pro");
        bestBuy.put(58963258l, "Washing Machine");

        Set<Map.Entry<Long, String>> products = bestBuy.entrySet();
        for (var product : products) {
            System.out.println(product);

        }

    }
}

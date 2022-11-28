package HomeWork;

import java.util.*;

public class C28HWTask2Map {

    /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {

    String[]countries= {"Egypt", "USA", "UAE", "France"};
    String[]capitals= {"Cairo", "DC", "Dubai", "Paris"};

    TreeMap<String, String> conDetails= new TreeMap<>();
    for(int i=0; i<countries.length; i++){
        conDetails.put(countries[i], capitals[i]);
    }


        System.out.println(conDetails);

      //  Print all keys and values from a country map using for each loop.
        System.out.println("***********Entries with for**************");
        Set<Map.Entry<String, String>> entries=  conDetails.entrySet();
        for(Map.Entry<String, String> entry:entries){
            System.out.println(entry);
        }

        System.out.println("***********Entries with Iterator**************");
        //  Print all keys and values from a country map using Iterator.
        Iterator<Map.Entry<String, String>> it= entries.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("***********values with for**************");
        Collection<String> values= conDetails.values();
        for(String value:values){
            System.out.println(value);
        }

        System.out.println("***********values with Iterator**************");
        Iterator<String> ite= values.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }



}
}

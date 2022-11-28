package HomeWork;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class C28HWTask6Collections {
   /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/

    public static void main(String[] args) {

        LinkedHashSet <String> con = new LinkedHashSet<>();
        con.add("I");
        con.add("Love");
        con.add("Java");

        System.out.println(setConcatenat(con));

    }

    public static String setConcatenat(Set<String> set){
        String result="";
        for(String string: set){
             result=result+ string +" ";
        }
   return result; }
}

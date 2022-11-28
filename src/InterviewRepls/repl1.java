package InterviewRepls;

import java.util.*;

public class repl1 {
    //create a method that will take a string and
    // return a map out of it containing each char and number of its occurrence
    public static void main(String[] args) {

        String str="nesreensafwat";
        System.out.println(charOccurance(str));
    }








   public static Map<Character, Integer> charOccurance (String str) {
       char[] chrarr = str.toCharArray();
       Map<Character, Integer> map = new TreeMap<>();
       for (char chr : chrarr) {
           if (map.get(chr) == null) {
               map.put(chr, 1);
           } else {
               int count = map.get(chr) + 1;
               map.put(chr, count);
           }
       }

   return map;}





    public static void display(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            Set<Map.Entry<String, Integer>> allEntries = map.entrySet();
            for (Map.Entry<String, Integer> entry : allEntries) {
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        } else {
            System.out.println("map is empty");
        }


    }
}
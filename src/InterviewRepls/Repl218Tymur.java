package InterviewRepls;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Repl218Tymur {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        items.add("tv");
        items.add("switch");
        items.add("tv");

        countRepeatation(items);
    }


    public static ArrayList<String> countRepeatation(ArrayList<String> items) {
        LinkedHashSet<String> set= new LinkedHashSet<>();

        for(String item:items){
          int count=1;
            if(!set.add(item)){
                while(!set.add(item+count)){
                    count++;
                }
            }
        }
ArrayList<String> newList= new ArrayList<String>(set);
        System.out.println(newList);
        return newList;
    }
}

package InterviewRepls;

import java.util.*;

public class Repl218 {
   /* public static List<String> countRepeatation (ArrayList<String> items){

int count=0;
        String [] uniqueItems= new String[items.size()];
        for(int i=0;i< items.size();i++){
            for(int j=0; j<uniqueItems.length;j++)
            if(items.get(i).equalsIgnoreCase(uniqueItems[j])){
                count++;
                uniqueItems[j]=items.get(i)+count;

            }else{uniqueItems[j]=items.get(i);}


        }
        List<String> b = Arrays.asList(uniqueItems);
        System.out.println(b);
        return b;
            }*/


    /*public static List<String> countRepeatation (ArrayList<String> items){
        LinkedHashMap <String, Integer> countedItems= new LinkedHashMap<>();
        Set<Map.Entry<String, Integer>> allEntries= countedItems.entrySet();
        for (Map.Entry<String, Integer> entry :allEntries)
        for(int i=0; i<items.size(); i++){

        }
    }*/

    public static void main(String[] args) {

      ArrayList<String>  items=new ArrayList<>();
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");

        //countRepeatation(items);
    }
}

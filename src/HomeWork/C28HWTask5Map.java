package HomeWork;

import java.util.*;

public class C28HWTask5Map {
    public static void main(String[] args) {
        HashMap<String,Integer> empMap= new HashMap<>();
        empMap.put("George", 6000);
        empMap.put("Emmanuel", 3500);
        empMap.put("Dina", 5400);
        empMap.put("Mike", 6000);
        empMap.put("Daniel", 4000);
        empMap.put("Mary", 8500);
        empMap.put("Thomas", 8400);

    int maxValue=0;

    Set<Map.Entry<String, Integer>> allEmpEntriesSet=empMap.entrySet();
    for(Map.Entry<String, Integer> entry:allEmpEntriesSet){
        if(entry.getValue()>maxValue){
        maxValue= entry.getValue();}
    }

    for(Map.Entry<String, Integer> entry:allEmpEntriesSet){
        if(entry.getValue()==maxValue){
            System.out.println(entry);
        }
    }


        }
    }

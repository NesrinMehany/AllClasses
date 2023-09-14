package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scores {
    public static void main(String[] args) {
        Integer[] s= {12,24,10,24};

        System.out.println(breakingRecords(Arrays.asList(s)));

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max= scores.get(0);
        int min= scores.get(0);
        int countMax=0;
        int countMin=0;
        for(int i=0;i<scores.size();i++){
            if(scores.get(i)>max){
                max=scores.get(i);
                countMax++;
            }
            if(scores.get(i)<min){
                min= scores.get(i);
                countMin++;
            }
        }
        ArrayList<Integer> point = new ArrayList<Integer>();
        point.add(countMax);
        point.add(countMin);
        return point;


    }

}
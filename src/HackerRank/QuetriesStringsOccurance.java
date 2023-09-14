package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuetriesStringsOccurance {
    public static void main(String[] args) {
        List<String> strings =new ArrayList<>(Arrays.asList(new String[]{"ab", "bc", "abc"})) ;
        List<String> query = new ArrayList<>(Arrays.asList(new String[]{"ab", "bc", "ac"}));
        matchingSrings(strings,query);

    }

    public static List<Integer> matchingSrings(List<String> strings, List<String> queries){

        List<Integer> matchingString = new ArrayList<>();
        for(int i=0; i<queries.size(); i++){
            int counter=0 ;
            for(String string:strings){
                if (queries.get(i).equalsIgnoreCase(string)){
                    counter++;
                }

            }
            matchingString.add(counter);
        }System.out.println(matchingString);

return matchingString;
    }
}

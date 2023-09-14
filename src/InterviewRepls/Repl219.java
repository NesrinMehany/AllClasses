package InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl219 {

    public static void main(String[] args) {
        String[] names = {"steve", "stevens", "danny", "steves", "dan", "john", "johny", "joe", "alex", "alexander"};
        String[] query = {"steve", "alex", "joe", "john", "dan"};
        countOnlyPrefixes(Arrays.asList(names), Arrays.asList(query));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        List<Integer> counts = new ArrayList<>();
        for (String prefix : query) {
            int counter = 0;
            for (String name : names) {
                if (!name.equalsIgnoreCase(prefix)) {
                    if (name.contains(prefix)) {
                        counter++;
                    }
                }
            }
            counts.add(counter);
        }
        return counts;
    }
}

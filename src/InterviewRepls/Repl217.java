package InterviewRepls;

import java.util.*;

public class Repl217 {
    public static void main(String[] args) {
        Integer[] a = {12,12,13,45,78,67,87};
        System.out.println(countDuplicates(Arrays.asList(a)));

    }
    static int countDuplicates(List<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (map.get(numbers.get(i)) == null) {
                int counter = 0;
                for (int y = i + 1; y < numbers.size(); y++) {
                    if (numbers.get(i) == numbers.get(y))
                        counter++;
                }
                map.put(numbers.get(i), counter);
            }
        }
        System.out.println(map);

        int count = 0;
        Set<Map.Entry<Integer, Integer>> sets = map.entrySet();
        for (Map.Entry<Integer, Integer> set : sets) {
            if (set.getValue() > 0) {
                count++;
            }
        }
        return count;

    }
}

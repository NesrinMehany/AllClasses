package InterviewRepls;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Repl217Mina {

    static int countDuplicates(List<Integer> numbers) {

        int duplicates = 0;
        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        for (Integer number : set) {

            int counter = 0;
            for (int y = 0; y < numbers.size(); y++) {
                if (number == numbers.get(y))
                    counter++;

            }
            if (counter > 0) {
                duplicates++;

            }
        }
        System.out.println(duplicates);
        return duplicates;
    }

    public static void main(String[] args) {
        Integer[] a = {12, 12, 7, 5, 5, 7, 7};
        System.out.println(countDuplicates(Arrays.asList(a)));

    }

}

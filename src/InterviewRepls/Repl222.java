package InterviewRepls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repl222 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list);
        int largest = list.get(list.size() - 1);
        int largest2 = list.get(list.size() - 2);
        int sum = largest + largest2;

        System.out.println(sum);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int largest1 = 0;
        int largest2 = 0;


        for (Integer num : list) {
            if (num > largest1) {
                largest1 = num;
            }
        }

        for (Integer num : list) {
            if (num > largest2 && num < largest1) {
                largest2 = num;
            }
        }
        int sum = largest1 + largest2;

        return sum;
    }
}

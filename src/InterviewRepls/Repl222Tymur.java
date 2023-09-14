package InterviewRepls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repl222Tymur {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);




        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        Collections.sort(list);
        int largest = list.get(list.size() - 1);
        int largest2 = list.get(list.size() - 2);
        int sum = largest + largest2;
        return sum;
    }
}

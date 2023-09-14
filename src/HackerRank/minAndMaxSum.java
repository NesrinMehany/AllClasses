package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minAndMaxSum {
    public static void main(String[] args) {
        Integer[] numbers = {396285104 ,573261094 ,759641832, 819230764 ,364801279};
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        miniMaxSum(list);


    }

    public static void miniMaxSum(List<Integer> nums) {


        List<Long> sums = new ArrayList<>();

        for (int y = 0; y < nums.size(); y++) {

            Long sum = 0l;
            for (int i = 0; i < nums.size(); i++) {
                sum =sum+ nums.get(i);

            }

            sum = sum - nums.get(y);

            sums.add(sum);


        }

        long max = sums.get(0);
        long min= sums.get(0);
        for (long sum : sums) {
            if (sum > max) {
                max = sum;
            } else if (sum<min) {
                min=sum;

            }
        }
        System.out.println(min + " " +max);

    }
}

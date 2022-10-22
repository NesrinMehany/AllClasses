package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] muns = {100, 200, 300, 400, 500, 600, 700, 800};


        ArrayList<String> str = new ArrayList<String>();
        String word = "";

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                word = letters[i] + numbers[j] + nums[j] + muns[j];
                str.add(word);

            }

        }
        System.out.println(Arrays.toString(str.toArray()));
    }
}

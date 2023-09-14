package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusandMin {
    public static void main(String[] args) {

        Integer[] numbers = {-4 ,3 ,-9, 0, 4, 1};
        List<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
plusMinus(nums);

    }
       public static void plusMinus(List<Integer> arr) {
        double evennums = 0;
        double oddNums = 0;
        double zero = 0;
        for (int num : arr) {
            if (num > 0) {
                evennums++;
            } else if (num < 0) {
                oddNums++;
            } else {
                zero++;
            }
        }
int size=arr.size();
       double evenratio= (evennums/size);
        double oddratio= oddNums/ size;
        double zeroRatio= zero/size;

        System.out.println(evenratio );
           System.out.println(oddratio );
           System.out.println(zeroRatio );
    }


}

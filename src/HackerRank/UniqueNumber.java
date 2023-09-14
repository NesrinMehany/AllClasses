package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumber {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 3, 2, 1}));
        lonelyinteger(a);
    }
        public static int lonelyinteger (List < Integer > a) {

            int uniqueNum = 0;
            for (int i = 0; i < a.size(); i++) {

                int counter = 0;
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(i) == a.get(j)) {
                        counter++;
                    }
                }
                if (counter == 1) {
                    uniqueNum = a.get(i);
                    System.out.println(uniqueNum);
                }
            }
return uniqueNum;
        }


}
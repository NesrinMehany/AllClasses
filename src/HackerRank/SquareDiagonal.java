package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SquareDiagonal {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(11);
        a.add(2);
        a.add(4);
        b.add(4);
        b.add(5);
        b.add(6);
        c.add(10);
        c.add(8);
        c.add(-12);

        arr.add(a);
        arr.add(b);
        arr.add(c);

   diagonalDifference(arr);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int size = arr.size();
        int num = 0;
        int num2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            num += arr.get(i).get(i);
            num2+= arr.get(i).get(size-i-1);
        }

        int dif = Math.abs(num-num2);


        System.out.println(dif);
        return dif;
    }
}


package HomeWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class C28HWTask7Collections {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(10);
        nums.add(50);
        nums.add(30);
        nums.add(22);
        nums.add(5);
        nums.add(10);
        nums.add(5);


        System.out.println(ListSum(nums));
    }

    public static int ListSum(List<Integer> ls){
        int sum =0;
        for(int num:ls){
            sum+=num;
        }
        return sum;
    }
}

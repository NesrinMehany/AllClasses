package InterviewRepls;

import java.util.Arrays;

public class Repl216 {
    public static void main(String[] args) {
        sumZero(6);
    }

    public static int[] sumZero(int num) {

        int sum = 0;
        int[] arr = new int[num];
        if (num % 2 == 0) {
            for (int i = 0; i < num; i++) {
                if ((i + 1) % 2 != 0) {
                    arr[i] = i + 1;
                } else {
                    arr[i] = (int) Math.copySign(arr[i - 1], -2);
                }
            }
        } else {
            arr[0] = 0;
            for (int i = 1; i < num; i++) {
                if (i % 2 != 0) {
                    arr[i] = i;
                } else {
                    arr[i] = (int) Math.copySign(arr[i - 1], -2);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int no : arr) {
            sum += no;
        }
        System.out.println("The sum of this array's elements = " + sum);
        return arr;
    }




public static int[] sumToZero(int num) {

        int sum=0;
        int[] sum2zero = new int[num];
        for (int i = 0; i < num; i++) {
            sum2zero[i] =0;
            sum+=sum2zero[i];


        }
        System.out.println(Arrays.toString(sum2zero));
    System.out.println(sum);
        return sum2zero;
    }

}
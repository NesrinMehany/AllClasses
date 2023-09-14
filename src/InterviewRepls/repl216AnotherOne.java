package InterviewRepls;

import java.util.Arrays;

public class repl216AnotherOne {
    public static void main(String[] args) {
        arraySumToZero(3);
    }

    public static int[] arraySumToZero(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i += 2) {
            if (N % 2 == 0) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            } else {
                for (i = 1; i < N; i += 2) {
                    arr[0]=0;
                    arr[i] = i;
                    arr[i + 1] = -(i);

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
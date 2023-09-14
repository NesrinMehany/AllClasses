package InterviewRepls;

public class Repl225 {
    public static void main(String[] args) {
        System.out.println(reverseIntege(2265));

    }


    public static int reverseInteger(int N) {

        int reversed = 0;
        while (N != 0) {
            reversed = reversed * 10 + N % 10;
            N = N / 10;
        }
        return reversed;
    }

    public static int reverseIntege(int N) {

        StringBuilder sb = new StringBuilder(String.valueOf(N));
        int reversed = Integer.parseInt(String.valueOf(sb.reverse()));

        return reversed;
    }

}


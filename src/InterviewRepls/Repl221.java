package InterviewRepls;

public class Repl221 {

    public static void main(String[] args) {
        System.out.println(findMaxLenEven("find Max Even"));
    }


    public static String findMaxLenEven(String str) {
        String[] arr = str.split(" ");
        String max = "-1";
        int largest = 0;
        for (String word : arr) {
            if (word.length() % 2 == 0) {
                if (word.length() > largest) {
                    largest = word.length();
                    max = word;
                }
            }
        }

        return max;

    }
}

package HomeWork;

import java.util.Scanner;

public class StringMethodsTask5 {
    public static void main(String[] args) {
        /*How would you check if String is palindrome or not? aba=> trueAbbc =>false*/
        boolean plaindrome;

        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        StringBuilder a = new StringBuilder(userInput);
        a.reverse();
        String b = userInput;


        if (a.toString().equals(b)) {
            plaindrome = true;
        } else {
            plaindrome = false;
        }
        System.out.println(plaindrome);
    }
}

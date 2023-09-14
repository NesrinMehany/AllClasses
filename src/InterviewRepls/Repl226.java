package InterviewRepls;

public class Repl226 {
    public static void main(String[] args) {
        System.out.println(reverse("Syntax is Great"));
    }

    public static String reverse(String strToRev) {
        String[] words = strToRev.split(" ");
        String revword = "";

            for (int i = words.length-1; i >= 0; i--) {
                revword += words[i]+" ";
            }
        return revword.trim();
    }
}

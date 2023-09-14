package InterviewRepls;

public class Repl220 {

    public static void main(String[] args) {
        System.out.println(formatString("Ilo@ve^y*ou% "));

    }


    public static String formatString(String S) {


        String st = S.replaceAll("[^a-zA-Z0-9]", "");
        String formatted = "";
        for (int i = 0; i < st.length(); i++) {

            if (i > 2 && i % 3 == 0) {
                formatted += '-';
            }
            formatted += st.charAt(i);

        }

        return formatted;
    }
}

package InterviewRepls;

public class Repl224 {

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbccadddda"));


    }

    public static String removeConsecutiveDuplicates(String input) {

        String output = "";

            for (int i = 0; i < input.length(); i++) {
                if(i+1 >= input.length()){
                    output += input.charAt(i);
                    break;
                }
                    if (!(input.charAt(i) == input.charAt(i+1))) {
                        output += input.charAt(i);
                }
            }


        return output;
    }
}
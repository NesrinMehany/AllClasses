package HackerRank;

public class CamelCase {
    public static void main(String[] args) {

        String meth = "S;M;plasticCup()";
        System.out.println(splitOrCombine(meth));
    }

    public static String splitOrCombine(String s) {
        StringBuilder met = new StringBuilder();
        if (s.startsWith("S;")) {
            s = s.substring(4).replaceAll("[^a-zA-Z]", "");

            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    met.append(" ");
                }
                met.append(s.charAt(i));
            }
        } else if (s.startsWith("C;")) {
            
        }
        return met.toString();
    }
}
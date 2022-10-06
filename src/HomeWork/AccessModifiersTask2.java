package HomeWork;

public class AccessModifiersTask2 {
    public static String reversed(String a){
        StringBuilder b=new StringBuilder(a).reverse();
        String newA=b.toString();
     return newA;
    }
// Task 3
    private static String word(String s){
        String vowels= s.replaceAll("[^AaEeIiOoUu]","");
        return vowels;
    }
}

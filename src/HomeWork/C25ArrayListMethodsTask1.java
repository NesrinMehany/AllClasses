package HomeWork;
import java.util.ArrayList;
import java.util.Iterator;
public class C25ArrayListMethodsTask1 {
    // Task#1 Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(6);
        words.add("string");
        words.add("long");
        words.add("double");
        words.add("integer");
        words.add("float");
        words.add("byte");

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String word = it.next();
            if(word.endsWith("e")){
                words.remove(word);
            }
        }System.out.println(words);

//Another way with Lambda
        words.removeIf(word-> word.endsWith("e"));
        System.out.println(words);
    }
}
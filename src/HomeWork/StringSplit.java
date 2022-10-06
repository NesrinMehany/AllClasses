package HomeWork;

public class StringSplit {

    public static void main(String[] args) {
        /*Task #3
         * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
         * How would you find out how many sentences are in that String?*/
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] q = a.split("[?]");
        int size = q.length;
        System.out.println("there are " + size + " sentences in this string");
    }
}

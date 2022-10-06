package HomeWork;

public class StringMethods2 {
    public static void main(String[] args) {
        /* another way for Task#2
         * Create a String that should be combination of letters, numbers and special characters.
         * Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/
        String mix = "I live @ Virginia & I love it. It has 4 Seasons, and I can live here for 100 more years";

        String mix2 = mix.replaceAll("[^A-za-z0-9]", "");
        int mix2Size = mix2.length();
        System.out.println("ther are "+mix2Size + " alphanumeric in this secntence");
    }

}

package HomeWork;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        /*
         * Create a String that should be combination of letters, numbers and special characters.
         * Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/
        String mix = "I live @ Virginia & I love it. It has 4 Seasons, and I can live here for 100 more years";
        String az = mix.replaceAll("[^a-z]", "");
        int azSize = az.length();
        System.out.println("ther are "+azSize + " lowercase letters in this secntence");
        String AZ = mix.replaceAll("[^A-Z]", "");
        int AZSize = AZ.length();
        System.out.println("ther are "+AZSize + " uppercase letters in this secntence");
        String nums = mix.replaceAll("[^0-9]", "");
        int numsSize = nums.length();
        System.out.println("ther are "+numsSize + " numbers in this secntence");
        String special = mix.replaceAll("[A-Za-z0-9]", "");
        int specialSize = special.length();
        System.out.println("ther are "+specialSize + " special characters in this secntence");
        String mix2 = mix.replaceAll("[^A-za-z0-9]", "");
        int mix2Size = mix2.length();
        System.out.println("ther are "+mix2Size + " alphanumeric in this secntence");
    }
}

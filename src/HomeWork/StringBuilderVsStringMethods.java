package HomeWork;

public class StringBuilderVsStringMethods {
    public static void main(String[] args) {
        /*Task #1
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String java="I love Java So Much";
        String  noSpace= java.replaceAll(" ", "");
        System.out.println(noSpace);


    }
}

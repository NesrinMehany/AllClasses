package com.syntax.class12;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        // Proper way of creating an object
        String str = new String("Java");
        // Simpler and shorter way provided by Java Creators to make our life a little easier
        String name = "Asma Alfadhli The Great"; // Only works for String and Wrapper classes
        /*
         * Counts the number of characters in a string including the spaces
         */
        System.out.println(str.length());
        System.out.println(name.length());
        if (name.length() > 15) {
            System.out.println("Name can't be more than 15 characters");
        }

//String Demo 1
        String str1 = "dna";
        /*
         * If we need to convert something from lowerCase to upper case we can use this method.
         */
        System.out.println(str1.toUpperCase());

        str1 = "JAVA";
        System.out.println(str1.toLowerCase());


        // StringDemo 2

        String firstName = "Olena";
        String lastName = "Dudka";
        System.out.println(firstName + lastName); // Mostly this is used
        System.out.println(firstName.concat(" ").concat(lastName));

        String str2 = " ";
        /*
         * isEmpty() returns true if a String is empty this method will return false even if you have
         * a space in a String variable however the isBalnk method does not count the spaces
         */
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());


        // String Demo 3
        String str3 = " i love java ";
        System.out.println(str3);
        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         */
        System.out.println(str3.trim());

        String str4 = "Java is Very easy";
        /*
         * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word
         * contains=> checks if a String Contains a specific letter or word
         */
        System.out.println(str4.startsWith("J"));
        System.out.println(str4.endsWith("y"));
        /*
         * Method chaining helps us call multiple methods on a single line one method after an other
         */
        System.out.println(str2.toLowerCase().contains("very"));


// TStringDemo 4
        String st = "Shah";
        String st2 = "Shah";
        String st3 = new String("Shah");

        if (str.equals("shah")) {
            System.out.println("I found it");
        }
        /*
         * equals checks if two Strings are exactly the same with exact same case
         * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the
         * case of letters
         */
        if (str.equalsIgnoreCase("shah")) {
            System.out.println("I found it with equalsIgnoreCase");
        }


        // StringDemo5



        String sr = "I love java programming";
        /*
         * charAt returns us the character at a specific index
         */
        System.out.println(sr.charAt(3));

        for (int i = 0; i < sr.length(); i++) {
            //print only the characters not spaces
            if (!(sr.charAt(i) == ' ')) {
                System.out.println(sr.charAt(i));
            }
// StringDemo6
                String s = "I love java programming";
                /*
                 * toCharArray will convert a String to an array of chars
                 */
                //Break till 1:25
                char[] charArray = s.toCharArray();

                System.out.println(Arrays.toString(charArray));
                System.out.println(charArray[7]);

                int counter = 0;
                for (char c : charArray) {

                    if (c == 'a') {
                        counter++;
                    }

                }
                System.out.println("letter a has appread " + counter + " times");
            }
       // StringDemo7

        String r="I am always consfused i was kidding";

        System.out.println(r.indexOf("a"));
        System.out.println(r.indexOf("s"));
        System.out.println(r.indexOf(" "));
        /*
         * substring() gives you smaller string from a String we can start the starting
         * part to this method and it will return us the subString from that index
         */
        System.out.println(r.substring(5));

        System.out.println(r.substring(5,11));
        // StringDemo8
        String t="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        System.out.println(t.replace("good", "Excellent"));
        System.out.println(t.replaceAll("[a-z]", "#"));
//Task

        /*
		 * store username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”
		 */
        String userName;
        String password;
        String confirmPassword;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the userName");
        userName=scanner.next();
        System.out.println("Please Enter the password");
        password=scanner.next();
        System.out.println("Please Enter the password Again");
        confirmPassword=scanner.next();


        if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if(!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
    }
    }}
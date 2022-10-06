package com.syntax.class14;

public class HomeworkTasks {
    public static void main(String[] args) {
        /*Create a String that will hold a sentence.
        Write a program to get a new String
        without any spaces*/

        String str="we love Java";
        str=str.replaceAll(" ","");
        System.out.println("str = " + str);

     /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

            String stra="dsfkjAJSKA1263#%6";
            stra=str.replaceAll("[^a-zA-Z0-9]","");
            System.out.println("stra = " + stra);
            System.out.println(str.length());
/*
How would you swap 2 strings without a temporary variable?
 */

        String str1="python";
        String str2="Java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);

 /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */
        String s="This is sentence i want to reverse";
        String[] arr=s.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]=stringBuilder.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);


        // plaindrome

        String r="abc";
        StringBuilder stringBuilder=new StringBuilder(r);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(r)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }

        /*
How would you swap 2 strings without a temporary variable?
 */

        String a="python";
        String b="Java";
        a=a+b;
        b=a.replace(b,"");
        a=a.replace(b,"");
        System.out.println(a);
        System.out.println(b);
        }
}

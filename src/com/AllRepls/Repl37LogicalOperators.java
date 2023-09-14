package com.AllRepls;

import java.util.Scanner;

public class Repl37LogicalOperators {
    /***For you to do:**

     Take 2 boolean inputs from a user:



     "Are you thirsty?"

     "Are you sleepy?"

     If user is thirsty and not sleepy--> drink=water

     If user is thirsty and sleepy--> drink=coffee

     If user is not thirsty and sleepy --> drink=tea

     Otherwise drink="nothing"

     ```
     Output:
     ```

     - Looks like you need to drink \_\_\_*/
    public static void main(String[] args) {
        boolean thristy;
        boolean sleepy;


        Scanner scan= new Scanner(System.in);
        System.out.println("Are you thristy?");
         String answer= scan.next();
        System.out.println("Are you sleepy?");
        String answer2 =scan.next();

        if (answer.equals("yes")){
            thristy= true;
        }else {thristy =false;}
        if (answer2.equals("yes")){
            sleepy=true;
        }else{sleepy = false;}

        if (thristy && ! sleepy ){
            System.out.println("Looks like you need to drink Water");
        }else if (sleepy &&  thristy){
            System.out.println("Looks like you need to drink Coffee");
        }else {
            System.out.println("Looks like you need to drink Tea");
        }

    }
    //another way:
    /*Scanner scan = new Scanner(System.in);

		boolean thirsty = scan.nextBoolean();
		boolean sleepy = scan.nextBoolean();
		String drink;

		if(thirsty && !sleepy) {
			drink = "water";

		}else if(thirsty && sleepy){
			drink = "coffee";
		}else if(!thirsty && sleepy){
			drink = "tea";
		}else {drink = "nothing";}

		System.out.println("Looks like you need to drink "+ drink);
	}*/
}

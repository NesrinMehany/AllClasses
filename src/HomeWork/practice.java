package HomeWork;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("ONE", "AAA");
        address.put("TWO", "BBB");
        address.put("THREE", "CCC");
        address.put("FOUR", "DDD");
        address.put("FIVE", "EEE");
        System.out.println("HashMap Before Remove :");
        Set<Map.Entry<String, String>> entries = address.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



        System.out.println("------------------");
        System.out.println("HashMap After Remove :");


        Set<Map.Entry<String, String>> entriees = address.entrySet();

           Iterator<Map.Entry<String,String>> it=entriees.iterator();
           while(it.hasNext()){
               Map.Entry <String,String>entree=it.next();
               if (entree.getKey().equals("ONE")||entree.getKey().equals("FOUR")){
                   it.remove();
           }
            }

        for (Map.Entry<String, String> entree : entriees) {
            System.out.println(entree.getKey() + " : " + entree.getValue());
        }
        }


        static List listRemoveElement (List a){
            Iterator<String> it = a.iterator();
            while (it.hasNext()) {
                if (it.next().startsWith("A")) {
                    it.remove();
                }
            }
            return a;
        }

        static boolean primeNum ( int num){
            boolean isPrime = true;
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            return isPrime;
        }


    }



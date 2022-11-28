package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class C25ArrayListMethodsTask3 {
   //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
    ArrayList<Integer> evenNums= new ArrayList<>();
    for(int i=0; i<500; i++){
        if (i%2==0){
            evenNums.add(i);
        }
    }
    evenNums.removeIf(num -> num%5==0);
        System.out.println(evenNums);

        // another way with iterator
        Iterator<Integer> it=evenNums.iterator();
        while (it.hasNext()){
            int value= it.next();
            if(value%5==0){
                it.remove();
            }
        }
        System.out.println(evenNums);
}
}
package InterviewRepls;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Repl217Tymur {

    public static void main(String[] args) {
        Integer[] a = {12,12,7,7,7,7,7};
        System.out.println(countDuplicates(Arrays.asList(a)));

    }

    static int countDuplicates(List<Integer> numbers) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> duplicates= new HashSet<>();
        for(Integer num:numbers){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }

return duplicates.size();


    }
}

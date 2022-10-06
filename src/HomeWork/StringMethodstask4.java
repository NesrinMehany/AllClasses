package HomeWork;

public class StringMethodstask4 {
    public static void main(String[] args) {
        /*
        * How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/

        StringBuilder reversed = new StringBuilder();
        StringBuilder word = new StringBuilder();
        String revSt;
        String backwards = "";
        String forward = "This is the sentence i want to reverse";

        String[] splitted = forward.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            word = new StringBuilder(splitted[i]);
            reversed = new StringBuilder(word.reverse());
            revSt = reversed.toString();

            backwards = (backwards + " " + revSt);


        }
        System.out.print(backwards);

       /* String str="This is sentence i want to reverse";
        String[] str1=str.split(" ");
        int value=str1.length;
        for (int i=0; i<value; i++){
            StringBuilder str2=new StringBuilder(str1[i]);
            System.out.print(str2.reverse()+" ");
        }*/

    }
}

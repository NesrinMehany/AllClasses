package InterviewRepls;

import java.util.Arrays;
import java.util.HashSet;

public class Repl227Mina {
    public static void main(String[] args) {
        HTMLElements("<div><b><p>hello<div></p></b></div></div>");
    }
    public static String HTMLElements(String str) {

        String[] arr = str.split("<");
        System.out.println(Arrays.toString(arr));
        HashSet<String>set= new HashSet<>(Arrays.asList(arr));
        System.out.println(set);

        int opencounter=0;
        int closCounter=0;
        String odd="";
        for(String setelement:set){
            for(String arElememt:arr){
                if(setelement.equals(arElememt)){
                    opencounter++;
                } else if (("/"+ setelement).equals(arElememt)) {
                    closCounter++;
                }
            }if (opencounter!=closCounter){
                odd= setelement;
            }
        }
        System.out.println(odd);
        return odd;
}}
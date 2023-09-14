package InterviewRepls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repl227 {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello<div></p></b></div></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));


    }

    public static String HTMLElements(String str) {

        String[] splitted = str.split("<");
        List<String> openingTags = new ArrayList<>();
        List<String> closingTags = new ArrayList<>();
        for (String tag : splitted) {
            if(tag.equals("")){
                continue;
            }
            if (tag.contains("/")) {
                closingTags.add(tag);
            } else {
                openingTags.add(tag);
            }
        }
        String odd = "";
        Iterator it1 = openingTags.iterator();
        while (it1.hasNext()) {
            String openingTag = (String) it1.next();

            if (!openingTag.endsWith(">") ) {
               openingTag=openingTag.substring(0, openingTag.indexOf(">"));
           }
            Iterator it2 = closingTags.iterator();
            while (it2.hasNext()) {
                String closingTag = (String) it2.next();
                if (closingTag.contains(openingTag) ) {
                    it2.remove();
                    it1.remove();
                    break;
                }
            }
        }
        String output ="true";
        if(openingTags.size()>0){
            odd = openingTags.get(0);
            output = odd.substring(0, odd.indexOf(">"));}
        else if (closingTags.size()>0){
            odd=closingTags.get(0).substring(1);
            output = odd.substring(0, odd.indexOf(">"));}


        return output;
    }
}

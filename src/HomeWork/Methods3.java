package HomeWork;

public class Methods3 {
    void Plaindrome(String word){

        StringBuilder word2= new StringBuilder(word);
        if (word.equalsIgnoreCase(word2.reverse().toString())){
            System.out.println(word + " is a plaindrome");
        }else{System.out.println(word + " is not a plaindrome");
        }
    }

    public static void main(String[] args) {


Methods3 m= new Methods3();
        m.Plaindrome("manu");

    }
}

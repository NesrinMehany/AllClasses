package HomeWork;

public class pr {
    public static void main (String[] args) {

        temptaureCheck(30);
    }

    public static void temptaureCheck(int temp)  {
        if (temp<32){
            throw new RuntimeException("It is freezing");
        }

    }
}

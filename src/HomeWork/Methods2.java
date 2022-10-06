package HomeWork;

public class Methods2 {
    void evenOrOdd(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is odd");
        }}

        String evenOdd(int b){

            String result;
            if (b % 2 == 0) {result="even";
            }else{result = "odd";}
            return result;
        }


    public static void main(String[] args) {
        Methods2 m=new Methods2();
        m.evenOrOdd(16);
        String b= m.evenOdd(5);
        System.out.println(b);
    }

}
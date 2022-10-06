package HomeWork;

public class methods6 {

    boolean isPrime(int i) {
boolean isprime=true;
        if (i > 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime= false;
                   break;
                }
            }
        } else {
            isprime= false;
        }
        return isprime;
    }



    boolean Prime(int i) {
        boolean prime=true;
        if (i > 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
        } else {
          return false;
        }
        return  true;
    }

    public static void main(String[] args) {


        methods6 m = new methods6();

        if (m.isPrime(28) == true) {
            System.out.println(" is prime");
        } else {
            System.out.println(" is not prime");
        }

        boolean pon= m.Prime(15);
        System.out.println(pon
        );
    }
}

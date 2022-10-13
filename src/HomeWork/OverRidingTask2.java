package HomeWork;
public class OverRidingTask2 {
    public static void main(String[] args) {
        System.out.println( new CreditCard(1000,25).CalculateInterest());
        System.out.println(  new Visa(1000,25).CalculateInterest());
        System.out.println( new AX(1000,25).CalculateInterest());
    }
}
class CreditCard {
    double balance;
    double interestRate;
    public CreditCard(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    double CalculateInterest() {
        double interestValue = balance * (interestRate/100);
        return interestValue;
    }
}
class Visa extends CreditCard {
    public Visa(double balance, double interestRate){
        super( balance,  interestRate);
    }
}

class AX extends CreditCard {
    public AX(double balance, double interestRate){
     super(balance, interestRate);
 }
    @Override
    double CalculateInterest() {
        double value = balance * 2*(interestRate / 100);
        return value;
    }
}
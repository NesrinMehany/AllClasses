package HomeWork;

public class OverRidingDegree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma"   );
    }
}
class Bachelors extends OverRidingDegree {

}

class Masters extends Bachelors {
    void getPrerequisite(){
        System.out.println("To get Masters you need Bachelors degree"   );
    }


        }

        class Tester{
            public static void main(String[] args) {
                new OverRidingDegree().getPrerequisite();
                new Bachelors().getPrerequisite();
                new Masters().getPrerequisite();
            }
        }
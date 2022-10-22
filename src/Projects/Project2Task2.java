package Projects;

public class Project2Task2 {
    public static void main(String[] args) {


    Marks[] objs= {new A(95,85,75),  new B(95,85,75,65)  };

        for(Marks obj:objs){
            obj.getPercentage();
    }
}
}


abstract class Marks{

    abstract double getPercentage();
}

class A extends Marks{
    double sub1;
    double sub2;
    double sub3;

    A(double sub1, double sub2, double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    @Override
    double getPercentage(){
        double percentage= (sub1+sub2+sub3)/3;
        System.out.println(percentage);
        return percentage;
    }
}

class B extends Marks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;


    B(double sub1, double sub2, double sub3, double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    @Override
    double getPercentage(){
        double percentage= (sub1+sub2+sub3)/3;
        System.out.println(percentage);
        return percentage;
        }}
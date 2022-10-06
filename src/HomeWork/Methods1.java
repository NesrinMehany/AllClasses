package HomeWork;

public class Methods1 {
    int largestNum(int a, int b){
       int largest;
        if(a>b){
            largest=a;
        }else{
            largest=b;
        }return largest;
    }

    public static void main(String[] args) {




        Methods1 m=new Methods1();
       int largest =  m.largestNum(10,150);
        System.out.println(largest);
    }
}

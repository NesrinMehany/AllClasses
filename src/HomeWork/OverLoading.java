package HomeWork;

public class OverLoading {
    static int area(int length, int width){
             int areas=length*width;
    return areas;}


    static int area(int length, int width, int hight){
        int areas=length*width*hight;
        return areas;}
}
class OverLoadingTesting {

    public static void main(String[] args) {

        System.out.println("Square area = " +OverLoading.area(5,5));
        System.out.println("Rectangle area = " +OverLoading.area(5,8));
        System.out.println("Box volume = " +OverLoading.area(4,4,4));
    }
}
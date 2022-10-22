package Projects;

interface Shape {

    double calculateArea(int radius);

    double calculatePerimiter(int radius);
}


class Project2Task1 {
    public static void main(String[] args) {


     Circle obj= new Circle();
     obj.calculateArea(7);
     obj.calculatePerimiter(7);

     Square sobj = new Square();
     sobj.calculateArea(6);
     sobj.calculatePerimiter(6);
    }
}
class Circle implements Shape {
    @Override
    public double calculateArea(int radius) {
        double area = (Math.PI*radius*radius);
        System.out.println("The area of this circle is "+ area);
        return area;
    }
    @Override
   public double calculatePerimiter(int radius){
       double perimeter = (Math.PI*(radius*2));
       System.out.println("The perimetere of this circle is "+ perimeter);
       return perimeter;
    }
}

class Square implements Shape {
    @Override
    public double calculateArea(int side) {
        double area = side*side;
        System.out.println("The area of this square is "+ area);
        return area;
    }
    @Override
    public double calculatePerimiter(int side){
        double perimeter = (side*4);
        System.out.println("The perimetere of this square is "+ perimeter);
        return perimeter;
    }

}
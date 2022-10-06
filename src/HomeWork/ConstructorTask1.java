package HomeWork;

public class ConstructorTask1 {
    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
     char gender;

    public ConstructorTask1(String color, int age, String hairColor, String eyeColor) {
        this.color = color;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public ConstructorTask1(String name, String country, char gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
    }

    public ConstructorTask1(){

    }

    void printnat(){
        System.out.println("my name is "+ name+ " and I am from "+ country );
    }
void printcol(){
    System.out.println("my race : "+ color + " and I am m "+ age+ " years old my hair is "+ hairColor +" and my eyes are  "+eyeColor );
}
}

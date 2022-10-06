package HomeWork;

public class ConstructorsTest {
    public static void main(String[] args) {
        ConstructorTask1 nationality = new ConstructorTask1("Jack", "USA", 'M');
        ConstructorTask1 colors = new ConstructorTask1("White", 30, "Blonde", "Blue");

        nationality.printnat();
        colors.printcol();

        ConstructorTask2 student1 = new ConstructorTask2("Rick", 95, 98, 78);
        student1.average();

        ConstructorTask2 student2 = new ConstructorTask2("Daniel", 85, 78, 90);
        student2.average();

        ConstructorTask2 student3 = new ConstructorTask2("Cory", 75, 55, 93);
        student3.average();

        ConstructorTask2 student4 = new ConstructorTask2("Melissa", 96, 97, 100);
        student4.average();

        ConstructorTask2 student5 = new ConstructorTask2("man", 60, 90);
    }
}

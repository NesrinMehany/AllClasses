package HomeWork;

//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
class Student {
   static String s = "Student";
    Student(String s) {
        this.s = s;
    }
   static  void study() {
        System.out.println(s + " study everyday");
    }
    void practice() {
        System.out.println(s + " practice everyday");
    }
}
class SyntaxStudent extends Student {
    SyntaxStudent(String s) {
        super(s);
    }

    void studyOnLine() {
        System.out.println(s + " study online 6 days a week");
    }
    @Override
    void practice() {
        System.out.println(s + " practice a lot everyday");
    }
}

class CollegeStudent extends Student {
    public CollegeStudent(String s) {
        super(s);
    }

    void studyInPerson() {
        System.out.println(s + " study in person 5 days a week");
    }


  static void study() {
        System.out.println( " college student study occasionally");
    }
}

class SchoolStudent extends Student {
    public SchoolStudent(String s) {
        super(s);
    }

    void toSchool() {
        System.out.println(s + " goes to school everyday");
    }
}

class Main {
    public static void main(String[] args) {

        CollegeStudent ob= new CollegeStudent("College");
        Student.study();
ob.study();
/*
        Student[] objs = {new Student("Student"), new SyntaxStudent("Syntax Student"), new CollegeStudent("College Student"), new SchoolStudent("School Student")};
        for (Student obj : objs) {

            obj.study();
            obj.practice();
            if (obj instanceof SyntaxStudent){
                ((SyntaxStudent) obj).studyOnLine();
            }else if (obj instanceof CollegeStudent ){
                ((CollegeStudent) obj).studyInPerson();

            }
        }*/
    }
}
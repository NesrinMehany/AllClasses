package HomeWork;

public class repl210 {
    public static void main (String[] args)  {

        try {
            studentGradeCheck(95);
        } catch (SyntaxStudentException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("SyntaxStudentException: You are an exceptionally awesome student");
        }

    }

public static void studentGradeCheck(int grade) throws SyntaxStudentException {
    if (grade>90){
throw new SyntaxStudentException("You are an exceptionally awesome student");
        }else {
        System.out.println("You are a great student");
    }

    }

    }


class SyntaxStudentException extends Exception{

    public SyntaxStudentException() {
        super();
    }

    public SyntaxStudentException(String message) {

        super(message);
    }
}








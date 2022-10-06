package HomeWork;

public class ConstructorTask2 {
    String studentName;
    private int mathGrade;
    private int englishGrade;
    private int scienceGrade;

    public ConstructorTask2(String studentName, int mathGrade, int englishGrade, int scienceGrade) {
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    private ConstructorTask2 (String studentName, int mathGrade){

    }

    protected ConstructorTask2 (String studentName, int englishGrade,int sciencehGrade){

    }


    ConstructorTask2 (int mathGrade, int englishGrade, int scienceGrade){

    }


    public int average(){
int ave= (mathGrade+englishGrade+scienceGrade)/3;
        System.out.println(studentName + " average is "+ave);
        return ave;
    }

    public static void main(String[] args) {
        ConstructorTask2 cons= new ConstructorTask2("Rick",50);
    }
}

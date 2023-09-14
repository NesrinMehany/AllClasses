package InterviewRepls;

public class practice {
    private String role;
    private int salary;

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }
}
 class employee{

       private practice prac;

       public employee(){
           this.prac= new practice();
           prac.setSalary(1000);
       }

       public int getSalary(){
           return prac.getSalary();
       }

 }


 class employee2{

    private practice prac;

    public employee2(){
        this.prac= new practice();
        prac.setSalary(5000);
    }

    public int getSalary(){
        return prac.getSalary();
    }

}

class Main {
    public static void main(String[] args) {

        employee2 emp = new employee2();
        System.out.println(emp.getSalary());


    }

}
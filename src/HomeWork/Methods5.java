package HomeWork;

public class Methods5 {
    /*Create a method createEmail(). Based on values of first name,
    lastName and email type, your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com*/
    String email(String fName, String lName , String emailtype){
String emailAddress = (fName+lName+"@"+emailtype+".com").toLowerCase();
        return emailAddress;  }

    public static void main(String[] args) {
        Methods5 m = new Methods5();
       String email=  m.email("nesrin","mehany","gmail");
        System.out.println(email);
    }
}

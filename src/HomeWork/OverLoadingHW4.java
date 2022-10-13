package HomeWork;

public class OverLoadingHW4 {

    private String name(String fName) {
        String fullName = fName;
        return fullName;
    }

    private String name(String fName, String lName) {
        String fullName = fName + " " + lName;
        return fullName;
    }

    private String name(String fName, String mName, String lName) {
        String fullName = fName + " " + mName + " " + lName;
        return fullName;
    }


    public static void main(String[] args) {
        OverLoadingHW4 b = new OverLoadingHW4();
        System.out.println(b.name("Nesrin"));
    }


}

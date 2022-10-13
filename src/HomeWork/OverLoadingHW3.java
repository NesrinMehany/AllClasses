package HomeWork;

public class OverLoadingHW3 {

static String name(String fName) {
    String fullName = fName;

    return fullName;
}

    static String name(String fName, String lName) {
        String fullName = fName + " " + lName;

        return fullName;
    }

    static String name(String fName, String mName, String lName) {
        String fullName = fName + " " + mName + " " + lName;

        return fullName;
    }
    public static void main(String[] args) {
        System.out.println(name("Nesrin", "Mehany"));
    }

}
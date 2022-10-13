package HomeWork;

public class OveroadingProgramming {
    String language;

    public OveroadingProgramming(String language) {
        this.language = language;
        System.out.println("I love " + language);
    }

    public OveroadingProgramming() {
        System.out.println("I love programming languages");
    }
}

    class OveroadingProgrammingTesting {
    public static void main(String[] args) {
         new OveroadingProgramming();
         new OveroadingProgramming("Java");

    }
}
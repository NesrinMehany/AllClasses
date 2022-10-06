package HomeWork;

public class AccessModifiersTask1 {
    int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String args[]) {

        AccessModifiersTask1 m = new AccessModifiersTask1();
        int[] b = {1, 2, 2, 3, 4, 5};

        System.out.println(m.arraySum(b));
    }
}

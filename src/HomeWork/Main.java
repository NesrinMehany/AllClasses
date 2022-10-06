package HomeWork;

class Main {

    int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String args[]) {

        Main m = new Main();
        int[] b = {1, 2, 2, 3, 4, 5};

        System.out.println(m.arraySum(b));
    }
}
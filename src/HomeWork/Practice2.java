package HomeWork;

public class Practice2 {

        public static void main(String[] args) {
            int[][] a = {
                    {1,2,3,4},
                    {4,5,6,7},
                    {1,3,5,7}
            };
            reduce10(a);

        }
        //create method reduce10 here
        static int[][] reduce10(int[][] a) {


            int[][] b = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    b[i][j] = (a[i][j] - 10);
                    System.out.print(b[i][j]+ " ");
                } System.out.println("");
            }

            return b;
        }
    }


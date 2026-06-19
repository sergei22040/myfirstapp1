package lr4;

public class example4 {
    public static void main(String[] args) {
        int rows = 6;
        int[][] tr = new int[rows][];
        int i = 0;
        int j = 0;

        for (i = 0; i < rows; i++) {
            tr[i] = new int[i+1];
            for (j = 0; j <= i; j++) {
                tr[i][j] = 2;
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < tr[i].length; j++) {
                System.out.print(tr[i][j] + " ");

            }
            System.out.println();
        }

    }
}

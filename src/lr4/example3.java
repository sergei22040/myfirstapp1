package lr4;

public class example3 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 6;
        int[][] py = new int[rows][cols];
        int i = 0;
        int j = 0;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                py[i][j] = 2;
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(py[i][j] + " ");

            }
            System.out.println();
        }

    }
}
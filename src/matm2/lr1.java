package matm2;

public class lr1 {
    public static void main(String[] args) {
        double[][] matrix = {
                {1, 2, 1, 2, 3},
                {2, 3, -1, 2, 5},
                {2, 5, 2, 2, 7},
                {3, 5, 1, 4, 8}
        };

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matrix[k][i]) > Math.abs(matrix[maxRow][i])) {
                    maxRow = k;
                }
            }

            double[] temp = matrix[i];
            matrix[i] = matrix[maxRow];
            matrix[maxRow] = temp;

            for (int k = i + 1; k < n; k++) {
                double factor = matrix[k][i] / matrix[i][i];
                for (int j = i; j <= n; j++) {
                    matrix[k][j] -= factor * matrix[i][j];
                }
            }
        }

        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += matrix[i][j] * x[j];
            }
            x[i] = (matrix[i][n] - sum) / matrix[i][i];
        }

        System.out.println("Решение системы уравнений:");
        for (int i = 0; i < n; i++) {
            long roundedResult = Math.round(x[i]);
            System.out.printf("x%d = %d\n", (i + 1), roundedResult);
        }
    }
}

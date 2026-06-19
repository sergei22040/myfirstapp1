package lr4;

import java.util.Arrays;
import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        Random random = new Random();

        int[][] mas = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mas[i][j] = random.nextInt(20);
            }
        }
        System.out.println("Исходный массив");
        for (int[] a : mas)
            System.out.println(Arrays.toString(a));

        int delrows = random.nextInt(rows);
        int delcols = random.nextInt(cols);
        int newRow = 0;

        int[][] newmas = new int[rows - 1][cols - 1];
        for (int i = 0; i < rows; i++) {
            if (i == delrows) {
                continue;
            }
            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delcols) {
                    continue;
                }

                newmas[newRow][newCol] = mas[i][j];
                newCol++;
            }
            newRow++;
        }
        System.out.println("Новый массив");
        for (int[] a : newmas)
            System.out.println(Arrays.toString(a));

    }
}


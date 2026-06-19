package lr4;

import java.util.Arrays;
import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 9;
        int[][] mas = new int[rows][cols];
        int i = 0;
        int j = 0;
        Random random = new Random();

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                mas[i][j] = random.nextInt(20);
            }
        }
        System.out.println("Исходный массив");
        for (int[] a : mas)
            System.out.println(Arrays.toString(a));

        int[][] newmas = new int[cols][rows];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                newmas[j][i] = mas[i][j];
            }
        }
        System.out.println("Перевернутый массив");
        for(int[] a : newmas)
            System.out.println(Arrays.toString(a));
    }
}

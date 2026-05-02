package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] nums = new int[size];
        int a = 0;
        int i = 0;
        while (i < size) {
            if (a % 5 == 2) {
                nums[i] = a;
                i++;
            }
            a++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

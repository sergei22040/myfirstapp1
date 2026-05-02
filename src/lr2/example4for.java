package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class example4for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int min = in.nextInt();
        int max = in.nextInt();
        if (max < min) {
            int c = min;
            min = max;
            max = c;
        }
        int size = max-min + 1;
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = min;
            min++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

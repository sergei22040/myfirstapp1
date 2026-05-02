package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class example3for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число >=2");
        int size = in.nextInt();
        int[] nums = new int[size];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        System.out.println(Arrays.toString(nums));

    }
}


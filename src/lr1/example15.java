package lr1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        System.out.println("num2: ");
        int num2 = in.nextInt();
        int num3 = num1+num2;
        int num4 = num1-num2;
        System.out.printf("Сумма чисел: %s Разность чисел: %s", num3, num4);
    }
}

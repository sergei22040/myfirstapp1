package lr3;

import java.util.Scanner;

public class example5while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int count = in.nextInt();
        int a = 0;
        int b = 1;
        int summa = 0;
        while (a < count) {
            if (b % 5 == 2 || b % 3 == 1) {
                summa = summa + b;
                a++;
                System.out.println(b);
            }
            b++;
        }
        System.out.println("Сумма чисел "+summa);
    }
}

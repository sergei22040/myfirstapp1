package lr3;

import java.util.Scanner;

public class example5for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int count = in.nextInt();
        int b = 1;
        int summa = 0;
        for (int a = 0; a < count; b++) {
            if (b % 5 == 2 || b % 3 == 1) {
                summa = summa + b;
                a++;
                System.out.println(b);
            }
        }
        System.out.println("Сумма чисел "+summa);
    }
}

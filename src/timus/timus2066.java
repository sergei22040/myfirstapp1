package timus;

import java.util.Scanner;

public class timus2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа в порядке возрастания от 0 до 100");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= 0 && b >= 0 && c >= 0 && a <= 100 && b <= 100 && c <= 100 && a <= b && b <= c) {
            if (a == 0 && b == 0 || a == 0 && b == 1 || a == 1 && b == 1 || b == 0 || c == 0 || (a == 1 && b == 1 && c == 1)) {
                System.out.println(a - b - c);
            } else System.out.println(a - b * c);

        }
    }
}
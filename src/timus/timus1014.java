package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class timus1014 {
    public static void main(String[] args) {
        Scanner ln = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 10^9");
        int n = ln.nextInt();
        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                digits.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(-1);
        } else {
            Collections.sort(digits);
            for (int digit : digits) {
                System.out.print(digit);
            }
        }
    }
}

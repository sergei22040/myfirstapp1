package timus;

import java.util.Scanner;

public class timus1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

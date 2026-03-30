package lr1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("num2: ");
        int num2 = in.nextInt();
        int num1 = num2-1;
        int num3 = num2+1;
        int num4 = (num1+num2+num3)*(num1+num2+num3);
        System.out.printf("%s %s %s %s", num1, num2, num3, num4);
    }
}

package lr1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("month name: ");
        String month = in.nextLine();
        System.out.println("num: ");
        int num = in.nextInt();
        System.out.printf("В %s %s дней \n", month, num);
        in.close();
    }
}

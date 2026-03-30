package lr1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("day name: ");
        String day = in.nextLine();
        System.out.println("month name: ");
        String month = in.nextLine();
        System.out.println("date: ");
        int date = in.nextInt();
        System.out.printf("day, month and date: %s %s %S \n", day, month, date);
        in.close();
    }
}

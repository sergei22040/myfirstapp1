package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("age: ");
        int age = in.nextInt();
        int year;
        year = LocalDate.now().getYear()-age;
        System.out.println("Ты родился в " + year + " году");
        in.close();
    }
}

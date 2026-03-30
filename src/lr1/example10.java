package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("year: ");
        int year = in.nextInt();
        int age;
        age = LocalDate.now().getYear()-year;
        System.out.println("Тебе " + age + " лет");
        in.close();
    }
}

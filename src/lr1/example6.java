package lr1;

import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input lastname: ");
        String lastname = in.nextLine();
        System.out.println("Input firstname: ");
        String firstname = in.nextLine();
        System.out.println("Input middlename: ");
        String middlename = in.nextLine();
        System.out.printf("Hello: %s %s %s \n", lastname, firstname, middlename);
        in.close();
    }
}

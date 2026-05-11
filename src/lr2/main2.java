package lr2;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        int num2 = num1 % 5;
        int num3 = num1 % 7;
        if (num2==2 & num3==1) {
        System.out.println("Удовлетворяет");
        }
        else {
        	 System.out.println("Не удовлетворяет");
        }
        in.close();
	}

}

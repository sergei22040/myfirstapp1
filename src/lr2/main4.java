package lr2;

import java.util.Scanner;

public class main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        if (num1>=5 & num1<=10) {
        System.out.println("Удовлетворяет");
        }
        else {
        	 System.out.println("Не удовлетворяет");
        }
        in.close();
	}

}

package lr2;

import java.util.Scanner;

public class main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        int num2 = num1 / 1000;
        System.out.println(num2 + " тысяч");
        in.close();
	}

}

package timus;

import java.util.Scanner;

public class timus_1409 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("num1 num2 ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = num2 - 1;
        int num4 = num1 - 1;
        System.out.println(num3+" "+" "+num4);
        in.close();
	}
}

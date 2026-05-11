package timus;

import java.util.Scanner;

public class timus_1000 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        System.out.println("num2: ");
        int num2 = in.nextInt();
        int num3 = num1 + num2 ;
        System.out.println(num3);
        in.close();
	}
}
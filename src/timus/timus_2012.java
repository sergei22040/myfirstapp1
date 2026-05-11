package timus;

import java.util.Scanner;

public class timus_2012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("f ");
        int numf = in.nextInt();
        int num1 = 12-(4 * 60 / 45)-numf;
        if (num1<=0) {
            System.out.println("YES");
            }
            else {
            	 System.out.println("NO");
            }
        in.close();

        
	}
}

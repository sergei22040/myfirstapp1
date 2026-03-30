package timus.timus_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        int n = in.nextInt();
        if(1>n || n>100){
            System.out.println("Неверное число");
            return;
        }
        System.out.println("A: ");
        int a = in.nextInt();
        if(1>a || a>100){
            System.out.println("Неверное число");
            return;
        }
        System.out.println("B: ");
        int b = in.nextInt();
        if(1>b || b>100){
            System.out.println("Неверное число");
            return;
        }
        int num4 = n*a*b*2;
        System.out.println("Требуется " + num4 + " нанограмм сульфида"  );
    }

}

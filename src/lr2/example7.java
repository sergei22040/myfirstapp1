package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = 10;
        char[] array = new char[size];
        for (int i = 0; i < size; i++) {
            array[i] = (char) ('a' + 2*i);
        }
        System.out.println(Arrays.toString(array));
        char[] reverseArray = new char[size];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[(array.length - 1) - i] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
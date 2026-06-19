package lr4;

public class example2 {
    public static void main(String[] args) {
        int figure = 8;
        int i;
        int j;
        int z;

        for (i = 1; i <= figure - 1; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = i; j < figure; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}

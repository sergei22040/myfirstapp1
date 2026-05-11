package lr3;

public class example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] alphabet = new char[size];
        char[] alphabetn = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i = 0;
        int j = 0;
        for (i = 0; i < size; i++) {
            Boolean statement = true;
            for (j = 0; j < alphabetn.length; j++) {
                if (b == alphabetn[j]) {
                    i--;
                    statement = false;
                    break;
                }
            }
            if (statement) {
                alphabet[i] = b;
            }
            b++;
        }
        for (int k = 0; k < size; k++) {
            System.out.print(alphabet[k] + "\t");
        }
    }
}
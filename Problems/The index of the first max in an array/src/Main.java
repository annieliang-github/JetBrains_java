import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (array[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}
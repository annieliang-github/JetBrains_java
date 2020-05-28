import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int num1 = array[array.length - 1];
        int num2 = array[array.length - 2];
        System.out.println(num1 * num2);

    }
}
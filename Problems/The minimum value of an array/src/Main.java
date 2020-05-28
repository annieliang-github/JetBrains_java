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
        int num = array[0];
        System.out.println(num);

    }
}
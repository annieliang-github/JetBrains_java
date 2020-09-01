import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        boolean isFixed = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                isFixed = true;
                break;
            }
        }
        System.out.println(isFixed);
    }


}
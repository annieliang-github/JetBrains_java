import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        int count = 1;
        int maxCount = 1;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i <array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i+1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(maxCount);

    }
}





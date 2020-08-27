import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            int max = array[i];
            int minIndex = i;
            int min = array[minIndex];
            if (i % 2 == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (max < array[j]) {
                        max = array[j];
                        maxIndex = j;
                    }
                }
                array[maxIndex] = array[i];
                array[i] = max;
            } else {
                for (int j = i + 1; j < array.length; j++) {
                    if (min > array[j]) {
                        min = array[j];
                        minIndex = j;
                    }
                }
                array[minIndex] = array[i];
                array[i] = min;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
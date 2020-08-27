
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int length = scanner.nextInt();
        int[] timesArr = new int[amount];

        for (int x = 0; x < amount; x++) {
            int count = 0;
            int[] array = new int[length];

            for (int y = 0; y < length; y++) {
                array[y] = scanner.nextInt();
            }

            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                int min = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (min > array[j]) {
                        count++;
                        min = array[j];
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    array[minIndex] = array[i];
                    array[i] = min;
                    count++;
                }
            }
            timesArr[x] = count;
        }

        int largestIndex = 0;
        for (int i = 1; i < timesArr.length; i++) {
            if (timesArr[i] > timesArr[largestIndex]) {
                largestIndex = i;
            }
        }
        System.out.println(largestIndex + 1);

    }
}
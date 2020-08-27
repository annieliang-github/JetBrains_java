import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            int max = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                array[maxIndex] = array[i];
                array[i] = max;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
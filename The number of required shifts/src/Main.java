import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int elem = array[i];

            while (j >= 0 && elem > array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            if (j + 1 != i) {
                array[j + 1] = elem;
                count++;
            }
        }
        System.out.println(count);
    }
}
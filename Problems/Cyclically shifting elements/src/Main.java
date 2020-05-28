import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 1; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        array[0] = scanner.nextInt();
        for (int x = 0; x < length; x++) {
            System.out.print(array[x] + " ");
        }


    }
}

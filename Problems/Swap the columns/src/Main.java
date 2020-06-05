import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int hang = scanner.nextInt();
        int lie = scanner.nextInt();

        int[][] array = new int[hang][lie];
        for (int i = 0; i < hang; i++) {
            for(int j = 0; j < lie; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int switch1 = scanner.nextInt();
        int switch2 = scanner.nextInt();

        for (int i = 0; i < hang; i++) {
            int tmp = array[i][switch1];
            array[i][switch1] = array[i][switch2];
            array[i][switch2] = tmp;
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
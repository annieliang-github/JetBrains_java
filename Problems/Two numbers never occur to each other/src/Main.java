import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean answer = true;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int x = 0; x < length - 1 ; x++) {
            if (array[x] == n && array[x + 1] == m) {
                answer = false;
                break;
            } else if (array[x] == m && array[x + 1] == n) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
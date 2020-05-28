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
        int num = scanner.nextInt();
        boolean answer = false;
        for (int x = 0; x < length; x ++) {
            if (array[x] == num) {
                answer = true;
            }
        }
        System.out.println(answer);
    }
}
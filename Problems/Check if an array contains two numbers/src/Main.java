import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean answer = false;

        for (int x = 0; x < size - 1; x++) {
            if (array[x] == num1 && array[x + 1] == num2) {
                answer = true;
                break;
            }
            if (array[x] == num2 && array[x+1] == num1)  {
                answer = true;
                break;
            }
        }


        System.out.println(answer);

    }
}
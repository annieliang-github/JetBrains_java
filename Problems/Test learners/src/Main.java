import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Yes!");
        } else if (num >= 2 && num <= 4) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }

    }
}
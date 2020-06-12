import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(Math.pow(x, 3) + x * x + x + 1);

    }
}
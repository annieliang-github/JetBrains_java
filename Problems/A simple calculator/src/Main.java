import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        String operation = scanner.next();
        long second = scanner.nextLong();
        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                    break;
                } else {
                    System.out.println("Division by 0!");
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }
    }
}
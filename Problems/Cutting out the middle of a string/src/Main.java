import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        if (length % 2 != 0) {
            System.out.print(str.substring(0, length / 2) + str.substring(length / 2 + 1));
        } else {
            System.out.print(str.substring(0, length / 2 - 1) + str.substring(length / 2 + 1));
        }
    }
}
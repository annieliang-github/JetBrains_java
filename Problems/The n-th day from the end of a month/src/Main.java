import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int offset = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println(LocalDate.of(year, month, date.lengthOfMonth() - offset + 1));
    }
}
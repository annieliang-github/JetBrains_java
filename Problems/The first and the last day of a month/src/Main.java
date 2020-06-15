import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = 1;
        LocalDate date1 = LocalDate.of(year, month, day);
        int lenOfMonth = date1.lengthOfMonth();
        LocalDate date2 = date1.plusDays(lenOfMonth - 1);

        System.out.println(date1 + " " + date2);
    }
}
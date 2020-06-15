import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int day3 = scanner.nextInt();

        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate date1 = date.plusDays(day1 - 1);
        LocalDate date2 = date.plusDays(day2 - 1);
        LocalDate date3 = date.plusDays(day3 - 1);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

    }

}
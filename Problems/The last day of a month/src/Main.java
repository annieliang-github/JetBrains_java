import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, day);
        System.out.println(date.getDayOfMonth() == date.lengthOfMonth());
    }
}
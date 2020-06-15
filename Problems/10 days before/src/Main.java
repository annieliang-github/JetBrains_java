import java.util.Scanner;
import java.time.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split("-");

        int year = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[2]);

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate past = date.minusDays(10);
        System.out.println(past);

    }
}
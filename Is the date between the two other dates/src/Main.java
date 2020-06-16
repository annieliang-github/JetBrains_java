import java.util.Scanner;
import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String m = scanner.next();
        String n = scanner.next();

        LocalDate dateTime = LocalDate.parse(x);
        LocalDate dateTime1 = LocalDate.parse(m);
        LocalDate dateTime2 = LocalDate.parse(n);

        System.out.println(dateTime.isBefore(dateTime1) && dateTime.isAfter(dateTime2) || dateTime.isBefore(dateTime2) && dateTime.isAfter(dateTime1));


    }
}
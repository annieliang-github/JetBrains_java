import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalDate date = LocalDate.parse(str);
        int dayYear = date.getDayOfYear();
        int dayMonth = date.getDayOfMonth();
        System.out.println(dayYear + " " + dayMonth);
    }
}
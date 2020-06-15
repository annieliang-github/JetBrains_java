import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalDate date = LocalDate.parse(str);
        LocalDate date1 = date.minusYears(30);
        LocalDate date2 = date.plusYears(30);

        System.out.println(date1);
        System.out.println(date2);
    }
}
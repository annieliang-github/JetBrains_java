import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date1 = LocalDate.of(year, month, 1);
        int lenOfMonth = date1.lengthOfMonth();
        LocalDate date2 = date1.plusDays(lenOfMonth - 1);

        for (int i = 1; i < lenOfMonth; i++) {
            if (date1.plusDays(i).getDayOfWeek().toString().equals("MONDAY")) {
                System.out.println(date1.plusDays(i));
            }

        }
    }
}

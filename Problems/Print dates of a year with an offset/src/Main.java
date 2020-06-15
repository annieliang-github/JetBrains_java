import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int offset = scanner.nextInt();
        LocalDate date = LocalDate.parse(str);

        int day = date.getDayOfYear();
        int distance = date.lengthOfYear() - day;
        for (int i = 0; i <= distance; i+= offset) {
            System.out.println(date.plusDays(i));
        }
    }
}
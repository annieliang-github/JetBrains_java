import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        LocalDateTime result = LocalDateTime.parse(scanner.next());

        for (int i = 1; i < count; i++) {
            LocalDateTime date = LocalDateTime.parse(scanner.next());
            if (date.isAfter(result)) {
                result = date;
            }
        }

        System.out.println(result);
    }
}
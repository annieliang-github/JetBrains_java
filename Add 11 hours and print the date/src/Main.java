import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(str);
        System.out.println(dateTime.plusHours(11).toLocalDate());
    }
}
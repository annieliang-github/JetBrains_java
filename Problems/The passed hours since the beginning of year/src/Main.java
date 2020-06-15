import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(str);
        int day = dateTime.getDayOfYear();
        int hour = dateTime.getHour();
        System.out.println((day-1) * 24 + hour);
    }
}
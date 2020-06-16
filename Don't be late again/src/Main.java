import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            String name = scanner.next();
            String time = scanner.next();
            LocalTime localTime = LocalTime.parse(time);
            int now = 19 * 60 + 30;
            int Closing = localTime.getHour() * 60 + localTime.getMinute();

            if (Closing - now > 30) {
                System.out.println(name);
            }
        }
    }
}
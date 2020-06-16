import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String board1 = scanner.nextLine();
        String board2 = scanner.nextLine();
        LocalDateTime time1 = LocalDateTime.parse(board1);
        LocalDateTime time2 = LocalDateTime.parse(board2);

        int count = Integer.parseInt(scanner.nextLine());
        int numCount = 0;

        for (int i = 0; i < count; i++) {
            String time = scanner.nextLine();
            LocalDateTime dateTime = LocalDateTime.parse(time);
            if (time1.isBefore(time2)) {
                if (dateTime.isBefore(time2) && dateTime.isAfter(time1) && !dateTime.equals(time2) ||dateTime.equals(time1)) {
                    numCount += 1;
                }
            } else {
                if (dateTime.isBefore(time1) && dateTime.isAfter(time2) && !dateTime.equals(time1) ||dateTime.equals(time2)) {
                    numCount += 1;
                }
            }

        }
        System.out.println(numCount);

    }
}
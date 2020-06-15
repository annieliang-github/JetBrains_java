import java.time.LocalTime;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        LocalTime time = LocalTime.parse(str);
        int hr = scanner.nextInt();
        int min = scanner.nextInt();

        System.out.println(time.minusHours(hr).minusMinutes(min));
    }
}
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        LocalTime time1 = LocalTime.parse(str1);
        LocalTime time2 = LocalTime.parse(str2);

        System.out.println(Math.abs(time1.toSecondOfDay() - time2.toSecondOfDay()));
    }
}
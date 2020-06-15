import java.util.Scanner;
import java.time.LocalTime;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalTime time = LocalTime.parse(str);
        System.out.println(time.withSecond(0));
    }
}
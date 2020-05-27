import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();
        long answer = hour2 * 3600 + min2  * 60 + sec2 - hour1 * 3600 - min1 * 60 - sec1;
        System.out.println(answer);
    }
}
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= count; i++) {
            int number = scanner.nextInt();
            if (number == 2) {
                d+= 1;
            } else if (number == 3) {
                c += 1;
            } else if (number == 4) {
                b += 1;
            } else if (number == 5) {
                a += 1;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a + " ");
    }
}
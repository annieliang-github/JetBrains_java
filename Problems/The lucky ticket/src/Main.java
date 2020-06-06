import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++) {
            int digit1 = Character.getNumericValue(str.charAt(i));
            sum1 += digit1;
        }

        for (int i = 3; i < 6; i++) {
            int digit2 = Character.getNumericValue(str.charAt(i));
            sum2 += digit2;
        }

        System.out.println(sum1 == sum2 ? "Lucky" : "Regular");
    }
}
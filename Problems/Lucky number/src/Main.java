import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < input.length() / 2; i++) {
            sum1 += Character.getNumericValue(input.charAt(i));
        }

        for (int i = input.length() / 2; i < input.length(); i++) {
            sum2 += Character.getNumericValue(input.charAt(i));
        }
        System.out.println(sum2 == sum1 ? "YES" : "NO");


    }
}
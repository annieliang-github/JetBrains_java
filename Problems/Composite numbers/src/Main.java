import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        boolean answer = true;
        if (number > 3) {
            for (long i = 2L; i < number; i++) {
                if (number % i == 0) {
                    answer = true;
                    break;
                } else {
                    answer = false;
                }
        }
        } else {
            answer = false;
        }
        return answer;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
import java.util.Scanner;

public class Main {

    public static long fib(long n){
        // write your code here
        long answer = 0;
        if (n % 2 == 1 && n >= 2) {
            answer = Math.abs(fib(n-1)) + Math.abs(fib(n-2));
        } else if (n % 2 == 0 && n >= 2) {
            answer = -Math.abs(fib(n-1)) - Math.abs(fib(n-2));
        } else if (n == 0) {
            answer = 0;
        } else if (n == 1) {
            answer = 1;
        }
        return answer;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        long n = 1;
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            if (m.compareTo(result) < 1) {
                System.out.println(i);
                break;
            }
        }
    }
}


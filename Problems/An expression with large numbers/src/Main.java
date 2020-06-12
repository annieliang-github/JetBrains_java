import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();


        BigInteger number = a.negate().multiply(b).add(c).subtract(d);

        System.out.println(number);

    }
}
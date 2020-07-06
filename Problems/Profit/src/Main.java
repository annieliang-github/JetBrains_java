import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();

        int ans = 0;

        while (m < k) {
            m = m * p/100 + m;
            ans++;
        }

        System.out.println(ans);


    }
}
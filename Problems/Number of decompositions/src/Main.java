import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        decomposition(num, num, "");
    }

    static void decomposition(int n, int m, String prefix) {
        if (n < 1) {
            System.out.println(prefix);
        }

        for (int i = 1; i <= Math.min(n, m); i++) {
            decomposition(n - i, i, prefix + ' ' + i);
        }
    }
}

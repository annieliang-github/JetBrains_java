import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String seq = "";
        for (int line = 1; line <= num; line++) {
            for (int j = 1; j <= line; j++) {
                seq = seq + line + " ";
            }
        }
        System.out.println(seq.substring(0, num * 2));



    }
}

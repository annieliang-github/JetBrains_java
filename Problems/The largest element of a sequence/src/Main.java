import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println(max);


    }
}
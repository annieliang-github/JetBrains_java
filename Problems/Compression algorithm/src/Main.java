import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            } else {
                System.out.print(ch);
                System.out.print(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        System.out.print(ch);
        System.out.print(count);
    }
}
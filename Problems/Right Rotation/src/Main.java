import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        String[] out = new String[strArray.length];
        int num = scanner.nextInt();

        for (int i = 0; i < strArray.length; i++) {
            out[(i + num) % strArray.length] = strArray[i];
        }
        System.out.println(String.join(" ", out));

    }
}
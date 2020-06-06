import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        char[] array = input.toCharArray();
        boolean res = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1] ) {
                    res = false;
            }
        }
        System.out.print(res ? "yes" : "no");
    }
}
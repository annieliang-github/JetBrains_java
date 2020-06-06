import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int length = 0;
        String word = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > length) {
                length = array[i].length();
                word = array[i];
            }
        }
        System.out.print(word);
    }
}
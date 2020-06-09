import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder date = new StringBuilder();
        date.append(input.substring(5, 7) + "/" + input.substring(8) + "/" + input.substring(0, 4));
        System.out.print(date);

    }
}
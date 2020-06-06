import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = str.toLowerCase().indexOf("the");
        System.out.print(index);
    }
}
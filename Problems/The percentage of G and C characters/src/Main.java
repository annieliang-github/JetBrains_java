import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        char[] array = input.toCharArray();
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'c' || array[i] == 'g') {
                count += 1;
            }
        }
        System.out.print(count / array.length * 100);
    }
}
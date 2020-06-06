import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        boolean ans = true;
        for (int i = 0; i < array.length - 1; i++) {
            int charValue1 = Character.getNumericValue(array[i]);
            int charValue2 = Character.getNumericValue(array[i + 1]);
            if (charValue1 + 1 != charValue2) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
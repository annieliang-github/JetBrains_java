import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        int answer = 0;
        boolean result = true;
        while (scanner.hasNext()) {
            String str = scanner.next();
            answer = str1.compareTo(str);
            if (answer <= 0) {
                result = true;
            } else {
                result = false;
            }
            str1 = str;
        }
        System.out.println(result);
    }
}
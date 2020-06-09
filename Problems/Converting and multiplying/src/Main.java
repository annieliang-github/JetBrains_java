import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (scanner.hasNext()) {
            try {
                int nextNum = scanner.nextInt();
                if (nextNum != 0) {
                    answer = nextNum * 10;
                    System.out.println(answer);
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + scanner.next());
            }

        }


    }
}
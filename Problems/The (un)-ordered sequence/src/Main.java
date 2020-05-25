import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int flag = scanner.nextInt();
        boolean answer = true;
        while (scanner.hasNext()) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                break;
            } else {
                if (firstNum >= secondNum && secondNum >= thirdNum && flag >= nextNum) {
                    answer = true;
                    flag = nextNum;
                } else if (firstNum <= secondNum && secondNum <= thirdNum && flag <= nextNum) {
                    answer = true;
                    flag = nextNum;
                } else {
                    answer = false;
                }
            }

        }
        System.out.println(answer);

    }
}
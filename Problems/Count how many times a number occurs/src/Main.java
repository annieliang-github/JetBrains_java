import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arrayNum = new int[len];
        int numWhat = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            (if arrayNum[i] == numWhat) {
                counter += 1;
            }
        }
        System.out.println(counter);


    }
}

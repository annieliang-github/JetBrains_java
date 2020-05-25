import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfParty = scanner.nextInt();
        int countLarger = 0;
        int countSmaler = 0;
        int countPerfect = 0;
        for (int i = 1; i <= numOfParty; i++) {
            int nextNum = scanner.nextInt();
            if (nextNum == 1) {
                countLarger++;
            } else if (nextNum == -1){
                countPerfect++;
            } else {
                countSmaler++;
            }
        }
        System.out.println(countSmaler + " " + countLarger + " " + countPerfect);

        // put your code here
    }
}
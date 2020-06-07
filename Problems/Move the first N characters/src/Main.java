import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder answer = new StringBuilder();
        int index = scanner.nextInt();
        char[] array = str.toCharArray();

        if (index <= array.length) {
            for(int i = index; i < array.length; i++) {
                answer.append(array[i]);
            }
            for (int i = 0; i < index; i++) {
                answer.append(array[i]);
            }
            System.out.print(answer);
        } else {
            System.out.print(str);
        }



    }
}
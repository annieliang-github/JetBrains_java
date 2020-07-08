import java.util.*;

public class Main {
    public static void main(String[] args) {

        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][4];
        while (scanner.hasNext()) {
            for (int i = 0; i < 4; i++) {
                matrix[i] = scanner.nextLine().toCharArray();
            }
        }

        String ans = "YES";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] == matrix[i + 1][j]
                        && matrix[i][j] == matrix[i][j + 1]
                        && matrix[i][j] == matrix[i + 1][j + 1]) {
                    ans = "NO";
                    break;
                }

            }
        }
        System.out.println(ans);
    }
}
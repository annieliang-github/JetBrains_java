import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] matrix = new int[num][num];
        int left = 0;
        int right = num - 1;
        int top = 0;
        int bottom = num - 1;
        int startNum = 1;
        while (bottom >= top && right >= left) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = startNum++;
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                matrix[j][right] = startNum++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = startNum ++;
            }
            bottom--;

            for (int j = bottom; j >= top; j--) {
                matrix[j][left] = startNum++;
            }
            left++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

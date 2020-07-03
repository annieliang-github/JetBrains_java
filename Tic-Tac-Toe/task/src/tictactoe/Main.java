package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        String res = "";

        //initiate the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 32;
            }
        }

        int sumRow1 = 0;
        int sumRow2 = 0;
        int sumRow3 = 0;
        int sumCol1 = 0;
        int sumCol2 = 0;
        int sumCol3 = 0;

        //print out first field
        System.out.println("---------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print((char) matrix[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");

        int flag = 0;




        //how to win
        boolean innerLoop = true;

        while (innerLoop) {


            while (true) {
                String input = scanner.nextLine();
                System.out.println("Enter the coordinates: " + input);

                //check if input is string or number
                if (input.length() == 3) {
                    String[] arr = input.split(" ");
                    int x = Integer.parseInt(arr[0]);
                    int y = Integer.parseInt(arr[1]);

                    if (x >= 1 && x <= 3 && y >= 1 && y <= 3) {
                        if (matrix[3 - y][x - 1] == 32) {

                            if (flag % 2 == 0) {
                                matrix[3 - y][x - 1] = 88;
                            } else {
                                matrix[3 - y][x - 1] = 79;
                            }

                            flag++;

                            //print field with step
                            System.out.println("---------");

                            for (int i = 0; i < 3; i++) {
                                System.out.print("| ");
                                for (int j = 0; j < 3; j++) {
                                    System.out.print((char) matrix[i][j] + " ");
                                }
                                System.out.print("|\n");
                            }
                            System.out.println("---------");
                            break;

                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("You should enter numbers!");
                }
            }

            if ((matrix[0][0]== 88 && matrix[0][1]== 88 && matrix[0][2]== 88) ||
                    (matrix[1][0]== 88 && matrix[1][1]== 88 && matrix[1][2]== 88) ||
                    (matrix[2][0]== 88 && matrix[2][1]== 88 && matrix[2][2]== 88)||
                    (matrix[0][0]== 88 && matrix[1][0]== 88 && matrix[2][0]== 88) ||
                    (matrix[0][1]== 88 && matrix[1][1]== 88 && matrix[2][1]== 88) ||
                    (matrix[0][2]== 88 && matrix[1][2]== 88 && matrix[2][2]== 88) ||
                    (matrix[0][0] == 88 && matrix[1][1] == 88 && matrix[2][2] == 88) ||
                    (matrix[0][2] == 88 && matrix[1][1] == 88 && matrix[2][0] == 88)) {
                System.out.println("X wins");
                innerLoop = false;

            } else if ((matrix[0][0]== 79 && matrix[0][1]== 79 && matrix[0][2]== 79) ||
                    (matrix[1][0]== 79 && matrix[1][1]== 79 && matrix[1][2]== 79) ||
                    (matrix[2][0]== 79 && matrix[2][1]== 79 && matrix[2][2]== 79)||
                    (matrix[0][0]== 79 && matrix[1][0]== 79 && matrix[2][0]== 79) ||
                    (matrix[0][1]== 79 && matrix[1][1]== 79 && matrix[2][1]== 79) ||
                    (matrix[0][2]== 79 && matrix[1][2]== 79 && matrix[2][2]== 79) ||
                    (matrix[0][0] == 79 && matrix[1][1] == 79 && matrix[2][2] == 79) ||
                    (matrix[0][2] == 79 && matrix[1][1] == 79 && matrix[2][0] == 79)) {
                System.out.println("O wins");
                innerLoop = false;

            } else if (matrix[0][0]!= 32 && matrix[0][1]!= 32 && matrix[0][2]!= 32
                    && matrix[1][0]!= 32 && matrix[1][1]!= 32 && matrix[1][2]!= 32
                    && matrix[2][0]!= 32 && matrix[2][1]!= 32 && matrix[2][2]!= 32) {
                System.out.println("Draw");
                innerLoop = false;
            }
        }

    }
}

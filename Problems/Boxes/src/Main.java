import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        String ans = "";

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < box1.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);


        if (box1[0] < box2[0] && box1[2] <= box2[2] || box1[0] <= box2[0] && box1[2] < box2[2]) {
            ans = "Box 1 < Box 2";
        } else if (box1[0] > box2[0] && box1[2] >= box2[2] || box1[0] >= box2[0] && box1[2] > box2[2]) {
            ans = "Box 1 > Box 2";
        } else if (box1[0] == box2[0] && box1[2] == box2[2]){
            ans = "Box 1 = Box 2";
        } else {
            ans = "Incomparable";
        }
        System.out.println(ans);
    }
}
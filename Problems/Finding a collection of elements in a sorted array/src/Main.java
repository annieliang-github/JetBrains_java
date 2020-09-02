import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        scanner.nextLine();
        int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < second.length; i++) {
            int ans = binarySearch(first, 0, first.length - 1, second[i]);
            if (ans != -1) {
                ans++;
            }
            System.out.print(ans +" ");
        }

    }


    public static int binarySearch(int[] first, int left, int right, int findVal) {

        int mid = (left + right) / 2;
        int midVal = first[mid];

        if (left > right) {
            return -1;
        }
        if (findVal > midVal) {
            return binarySearch(first, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(first, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
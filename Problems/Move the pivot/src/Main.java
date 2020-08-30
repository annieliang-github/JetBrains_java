import java.util.*;

public class Main {

    public static void moveThePivot(int[] array, int pivotIndex) {
        // write your code here
        int right = array.length - 1;

        int pivot = array[pivotIndex];
        int partitionIndex = -1;

        swap(array, pivotIndex, right);

        for (int j = 0; j < right; j++) {
            if (array[j] < pivot) {
                partitionIndex += 1;
                swap(array, j, partitionIndex);
            }
        }
        partitionIndex += 1;
        swap(array, partitionIndex, right);
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int pivotIndex = scanner.nextInt();
        moveThePivot(array, pivotIndex);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
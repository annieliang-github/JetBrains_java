import java.util.List;
import java.util.Scanner;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int count = 0;
        int num = 0;

        for (Integer i : list1) {
            if (i == elem) {
                count++;
            }
        }

        for (Integer i : list2) {
            if (i == elem) {
                num++;
            }
        }
        return count == num ? true : false;
    }
}
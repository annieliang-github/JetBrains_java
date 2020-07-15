import java.lang.reflect.Array;
import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        String[] array = str.split(" ");
        Set<String> setFromString = new HashSet<> (Arrays.asList(array));

        Set<Integer> newSet = new TreeSet<>();

        for (String s: setFromString) {
            newSet.add(Integer.parseInt(s));
        }

        return newSet;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        Set<Integer> greater10 = new TreeSet<>();

        for (Integer i : set) {
            if (i > 10) {
                greater10.add(i);
            }
        }
        set.removeAll(greater10);
    }

}



/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
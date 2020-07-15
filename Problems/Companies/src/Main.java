import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        System.out.println(list);


    }
}
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        Set<String> set = new TreeSet<>();

        while (scanner.hasNext()) {
            set.add(scanner.nextLine());
        }

        for (String s : set) {
            System.out.println(s);
        }

    }




}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        List list = new ArrayList();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        int num = (int) list.get(list.size() - 1);
        list.remove(list.get(list.size() - 1));



        List newList = new ArrayList();

        int distance = Math.abs((int) list.get(0) - num);

        //calculating distance
        for (int i = 1; i < list.size(); i++) {
            if (Math.abs((int) list.get(i) - num) <= distance) {
                distance = Math.abs((int) list.get(i) - num);
            }
        }

        int j;
        for (j = 0; j < list.size(); j++) {
            if (Math.abs((int) list.get(j) - num) == distance) {
                newList.add(list.get(j));
            }
        }

        Collections.sort(newList);
        for (Object obj : newList) {
            System.out.print(obj + " ");
        }

    }
}




import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        char[] word1 = scanner.nextLine().toLowerCase().toCharArray();
        char[] word2 = scanner.nextLine().toLowerCase().toCharArray();

        for (Character c : word1) {

            int freq = map1.getOrDefault(c, 0);
            map1.put(c, freq + 1);
        }


        for (Character c : word2) {
            int freq = map1.getOrDefault(c, 0);
            map1.put(c, freq - 1);
        }

        int count = 0;
        for (Integer i : map1.values()) {
            count += Math.abs(i);

        }
        System.out.println(count);


    }
}





import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;
        private boolean removed;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }

        public void remove() {
             removed = true;   
        }

        public boolean isRemoved() {
             return removed;   
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, String value) {
            // put your code here
            int idx = findKey(key);

            if (idx == -1) {
                return false;
            }

            table[idx] = new TableEntry(key, value);
            return true;

        }

        public T get(int key) {
            // put your code here
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return null;
            }

            return (T) table[idx].getValue();
        }

        public void remove(int key) {
            // put your code here
            int idx = findKey(key);

            if (findKey(idx) != -1) {
                table[idx] = null;
            }

        }

        private int findKey(int key) {
            // put your code here
            int hash = key % size;

            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;

                if (hash == key % size) {
                    return -1;
                }
            }

            return hash;
        }
    }

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        HashTable<Integer> hashTable = new HashTable<>(num);
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");

            if (str.startsWith("p")) {
                int index = Integer.parseInt(array[1]);
                String phoneNumber = array[2];
                hashTable.put(index, phoneNumber);
            }

            if (str.startsWith("g")) {
                int index = Integer.parseInt(array[1]);
                if (hashTable.get(index) == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(hashTable.get(index));
                }
            }

            if (str.startsWith("r")) {
                int index = Integer.parseInt(array[1]);
                hashTable.remove(index);
            }

        }

    }
}
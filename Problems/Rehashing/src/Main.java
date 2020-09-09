import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;

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
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            // put your code here
            int idx;
            while ((idx = findKey(key)) == -1) {
                rehash();
            }

            table[idx] = new TableEntry<>(key, value);
            return true;

        }


        public T get(int key) {
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return null;
            }

            return (T) table[idx].getValue();          
        }

        private int findKey(int key) {

            int hash = key % size;

            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;

                if (hash == key % size) {
                    return -1;
                }
            }
            return hash;
        }

        private void rehash() {
            // put your code here
            TableEntry<T>[] oldTable = table;
            int SCALING_FACTOR = 2;
            size *= SCALING_FACTOR;
            table = new TableEntry[size];

            for (var tableEntry : oldTable) {
                if (tableEntry != null) {
                    put(tableEntry.getKey(), tableEntry.getValue());
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder tableStringBuilder = new StringBuilder();

            for (int i = 0; i < table.length; i++) {
                if (table[i] == null) {
                    tableStringBuilder.append(i + ": null");
                } else {
                    tableStringBuilder.append(i + ": key=" + table[i].getKey()
                                                + ", value=" + table[i].getValue());
                }

                if (i < table.length - 1) {
                    tableStringBuilder.append("\n");
                }
            }

            return tableStringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        HashTable table = new HashTable(5);


        for (int i = 0; i < num; i++) {
            int id = scanner.nextInt();
            String name = scanner.nextLine().trim();
            table.put(id, name);
        }

        System.out.println(table.toString());

    }
}
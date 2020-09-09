import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashTable<ArrayList<String>> table = new HashTable<>(n);

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            int key = scanner.nextInt();
            String val = scanner.next();

            ArrayList<String> names = table.get(key);

            if (names == null) {
                names = new ArrayList<>();
                table.put(key, names);
            }

            names.add(val);
        }

        for (var tableEntry : table.entrySet()) {
            String tableEntryBuilder = tableEntry.getKey()
                    + ": "
                    + String.join(" ", tableEntry.getValue());
            System.out.println(tableEntryBuilder);
        }
    }

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
        private static final int SCALING_FACTOR = 2;
        private int size;
        private TableEntry<T>[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
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

            return table[idx].getValue();
        }

        public Set<TableEntry<T>> entrySet() {
            return Arrays.stream(table)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toSet());
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
            TableEntry<T>[] oldTable = table;
            size *= SCALING_FACTOR;
            table = new TableEntry[size];

            for (var tableEntry : oldTable) {
                if (tableEntry != null) {
                    put(tableEntry.getKey(), tableEntry.getValue());
                }
            }
        }
    }
}

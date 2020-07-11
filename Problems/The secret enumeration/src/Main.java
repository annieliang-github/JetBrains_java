public class Main {

    public static void main(String[] args) {
        Secret[] array = Secret.values();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);

    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
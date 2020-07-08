import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method


        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (!s.equals(s.toUpperCase())) {
                System.out.println(s.toUpperCase());
            } else {

                System.out.println("FINISHED");
                break;
            }
        }

    }
}





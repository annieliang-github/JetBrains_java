import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String website = scanner.nextLine();
        String shortSite = website.substring(website.indexOf("?") + 1);
        String newSite = shortSite.replace("=", " : ");
        String[] parts = newSite.split("&");

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].endsWith(": ")) {
                parts[i] += "not found";
            }
            System.out.println(parts[i]);
        }

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].startsWith("pass")) {
                System.out.println("password " + parts[i].substring(parts[i].indexOf(":")));
            }
        }


    }
}
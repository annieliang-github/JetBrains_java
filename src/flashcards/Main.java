package flashcards;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int numOfCards = Integer.parseInt(scanner.nextLine());
        String[] arrayTerm = new String[numOfCards];
        String[] arrayDef = new String[numOfCards];

        for (int i = 0; i < arrayTerm.length; i++) {
            System.out.println("The card #" + (i + 1) + ":");
            String term = scanner.nextLine();
            arrayTerm[i] = term;

            System.out.println("The definition of the card #" + (i + 1) + ":");
            String def = scanner.nextLine();
            arrayDef[i] = def;
        }
        for (int j = 0; j < arrayDef.length; j++) {
            System.out.println("Print the definition of \"" + arrayTerm[j] + "\":");
            String answer = scanner.nextLine();
            if (answer.equals(arrayDef[j])) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. The correct one is \"" + arrayDef[j] + "\".");
            }
        }

    }
}


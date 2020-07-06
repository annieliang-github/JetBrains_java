import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int numOfCompany = scanner.nextInt();
        double[] array = new double[numOfCompany];
        double[] percent = new double[numOfCompany];

        double tax = 0;
        int index = 0;
        for (int i = 0; i < numOfCompany; i++) {
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numOfCompany; i++) {
            percent[i] = scanner.nextDouble();
            Double calculatedTax = array[i] * percent[i] / 100;
            if (calculatedTax > tax) {
                tax = calculatedTax;
                index = i;
            }
        }
        System.out.println(index + 1);


    }
}
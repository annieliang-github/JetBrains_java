package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBean = 120;
        int cups = 9;
        int money = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.next();
            if (choice.equals("exit")) {
                break;
            } else {
                switch (choice) {
                    case "remaining":
                        System.out.println("The coffee machine has:\n" + water + " of water\n" + milk +
                                " of milk\n" + coffeeBean + " of coffee beans\n" + cups + " of disposable cups\n"
                                + "$" + money + " of money");
                        break;

                    case "fill":
                        System.out.println("Write how many ml of water do you want to add: ");
                        int waterAdd = scanner.nextInt();
                        System.out.println("Write how many ml of milk do you want to add:");
                        int milkAdd = scanner.nextInt();
                        System.out.println("Write how many grams of coffee beans do you want to add:");
                        int coffeeBeanAdd = scanner.nextInt();
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        int cupsAdd = scanner.nextInt();

                        water += waterAdd;
                        milk += milkAdd;
                        coffeeBean += coffeeBeanAdd;
                        cups += cupsAdd;
                        break;

                    case "take":
                        System.out.println("I gave you $" + money);
                        money -= money;
                        break;

                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        String buyWhat = scanner.next();
                        switch (buyWhat) {
                            case "1":
                                if (water >= 250 && coffeeBean >= 16 && milk >= 0 && cups >= 1) {
                                    water -= 250;
                                    coffeeBean -= 16;
                                    money += 4;
                                    cups -= 1;
                                    System.out.println("I have enough resources, making you a coffee!");
                                } else if (water < 250 && coffeeBean >= 16 && milk >= 0 && cups >= 1) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (water >= 250 && coffeeBean < 16 && milk >= 0 && cups >= 1) {
                                    System.out.println("Sorry, not enough coffee Bean!");
                                } else if (water >= 250 && coffeeBean >= 16 && milk < 0 && cups >= 1) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;

                            case "2":
                                if (water >= 350 && coffeeBean >= 20 && milk >= 75 && cups >= 1) {
                                    water -= 350;
                                    coffeeBean -= 20;
                                    milk -= 75;
                                    cups -= 1;
                                    money += 7;
                                    System.out.println("I have enough resources, making you a coffee!");
                                } else if (water < 350 && coffeeBean >= 20 && milk >= 75 && cups >= 1) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (water >= 350 && coffeeBean < 20 && milk >= 75 && cups >= 1) {
                                    System.out.println("Sorry, not enough coffee Bean!");
                                } else if (water >= 350 && coffeeBean >= 20 && milk < 75 && cups >= 1) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;

                            case "3":
                                if (water >= 200 && coffeeBean >= 12 && milk >= 100 && cups >= 1) {
                                    water -= 200;
                                    coffeeBean -= 12;
                                    milk -= 100;
                                    cups -= 1;
                                    money += 6;
                                    System.out.println("I have enough resources, making you a coffee!");
                                } else if (water < 200 && coffeeBean >= 12 && milk >= 100 && cups >= 1) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (water >= 200 && coffeeBean < 12 && milk >= 100 && cups >= 1) {
                                    System.out.println("Sorry, not enough coffee Bean!");
                                } else if (water >= 200 && coffeeBean >= 12 && milk < 100 && cups >= 1) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;

                            case "back":
                                break;
                        }





                }
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        // write your implementation here
        boolean status = false;
        switch(operation) {
            case DEPOSIT:
                account.setBalance(account.getBalance() + sum);
                status = true;
                break;
            case WITHDRAW:
                if (account.getBalance() >= sum) {
                    account.setBalance(account.getBalance() - sum);
                    status = true;
                    break;
                } else if (account.getBalance() < sum) {
                    System.out.println("Not enough money to withdraw.");
                    status = false;
                    break;
                }
        }
        return status;
    }

    /* Do not change code below */
    enum Operation {
        DEPOSIT,
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}
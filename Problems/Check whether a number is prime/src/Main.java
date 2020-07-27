import java.util.Scanner;
import java.util.concurrent.*;

class PrimeNumberExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            executor.submit(new PrintIfPrimeTask(number));
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number < 2) {
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return;
            }
        }
        System.out.println(number);
    }
}

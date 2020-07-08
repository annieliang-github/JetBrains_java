public class Main {

    public static void main(String[] args) {

        // create instances and start threads here
        Thread w1 = new WorkerThread();
        Thread w2 = new WorkerThread();

        w1.setName("worker-X");
        w2.setName("worker-Y");

        w1.start();
        w2.start();
    }
}

// Don't change the code below
class WorkerThread extends Thread {

    private static final int numberOfLines = 3;

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("do something...");
        }
    }
}
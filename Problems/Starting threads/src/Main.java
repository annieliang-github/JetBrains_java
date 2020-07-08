public class Main {

    public static void main(String[] args) {

        // create threads and start them using the class RunnableWorker
        RunnableWorker runnableWorker = new RunnableWorker();
        Thread t1 = new Thread(runnableWorker);
        Thread t2 = new Thread(runnableWorker);
        Thread t3 = new Thread(runnableWorker);

        t1.setName("worker-X");
        t2.setName("worker-Y");
        t3.setName("worker-Z");

        t1.start();
        t2.start();
        t3.start();

    }
}

// Don't change the code below       
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}
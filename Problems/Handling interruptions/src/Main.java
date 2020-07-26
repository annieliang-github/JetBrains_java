class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;
        try {
            while (!interrupted()) {
                counter++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("It was interrupted");
        }

    }
}
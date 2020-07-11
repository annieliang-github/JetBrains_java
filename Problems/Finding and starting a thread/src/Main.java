class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        // implement this method
        int i;

        for (i = 0; i < threads.length; i++) {
            if (threads[i].getState().equals(Thread.State.NEW)) {
                threads[i].start();
                threads[i].join();
                break;

            }
        }


    }
}
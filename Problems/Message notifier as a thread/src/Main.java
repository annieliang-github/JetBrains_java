class MessageNotifier extends Thread {

    // write fields to store variables here
    String msg;
    int repeats;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.repeats = repeats;
        this.msg = msg;

    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repeats; i++ ) {
            System.out.println(msg);
        }
    }
}
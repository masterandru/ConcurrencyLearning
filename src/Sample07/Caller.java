package Sample07;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

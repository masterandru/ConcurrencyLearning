package Sample07;

public class Callme {
    synchronized void call(String msg) {
        System.out.printf("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.printf("Прервано");
        }
        System.out.printf("]");
    }
}

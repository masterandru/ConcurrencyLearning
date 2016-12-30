package Sample06;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread firstThread = new NewThread("ONE"); // создать новый поток исполнения
        NewThread sechondThread = new NewThread("TWO"); // создать новый поток исполнения
        NewThread thirdThread = new NewThread("THRE"); // создать новый поток исполнения

        System.out.println("Пoтoк  Один  запущен : " + firstThread.thread.isAlive());
        System.out.println("Пoтoк Два  запущен: " + sechondThread.thread.isAlive());
        System.out.println("Пoтoк  Три  запущен: " + thirdThread.thread.isAlive());

        // Ждать завершения потоков исполнения
        try {
            System.out.println("Oждaниe завершения потоков.");
            firstThread.thread.join();
            sechondThread.thread.join();
            thirdThread.thread.join();
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен: " + firstThread.thread.isAlive());
        System.out.println("Пoтoк Два запущен: " + sechondThread.thread.isAlive());
        System.out.println("Пoтoк Три запущен: " + thirdThread.thread.isAlive());

        System.out.println("Глaвный поток завершен.");
    }
}

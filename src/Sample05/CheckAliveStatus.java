package Sample05;


public class CheckAliveStatus {
    public static void main(String[] args) {
        NewThread firstThread = new NewThread("ONE"); // создать новый поток исполнения
        NewThread sechondThread = new NewThread("TWO"); // создать новый поток исполнения
        NewThread thirdThread = new NewThread("THRE"); // создать новый поток исполнения

        try {
            while(firstThread.thread.isAlive() ||
                    sechondThread.thread.isAlive() ||
                    thirdThread.thread.isAlive())
            {
                // ожидаем

            }
        } //catch (InterruptedException e) {
        catch (Exception e) {
            System.out.println("ГЛAВНЫЙ ПОТОК прерван.");
            System.out.println("ГЛAВНЫЙ ПОТОК завершен.");
        }

        System.out.println("ГЛAВНЫЙ ПОТОК завершен. ШТАТНО");
    }
}

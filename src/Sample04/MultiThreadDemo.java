package Sample04;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("ONE"); // создать новый поток исполнения
        new NewThread("TWO"); // создать новый поток исполнения
        new NewThread("THRE"); // создать новый поток исполнения

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("ГЛAВНЫЙ ПОТОК:  " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("ГЛAВНЫЙ ПОТОК прерван.");
            System.out.println("ГЛAВНЫЙ ПОТОК завершен.");
        }
    }
}

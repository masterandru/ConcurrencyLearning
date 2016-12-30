package Sample03;

public class ExtendThread {
    public static void main(String args[]) {
        new NewТhread(); // создать новый поток исполнения
        try {

            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвн﻾  поток:  " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван.");
            System.out.println("Глaвный поток завершен.");

        }
    }
}

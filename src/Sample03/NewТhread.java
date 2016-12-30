package Sample03;

public class NewТhread extends Thread {
    NewТhread() {
        //  создать  новый,  второй  поток  исполнения
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток создан: ");
        start();  // запустить  поток  исполнения
    }

    //  Точка  входа  во  второй  поток  исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("- Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("- Дoчepний поток прерван.");
            System.out.println("- Дoчepний поток завершен.");
        }

    }
}

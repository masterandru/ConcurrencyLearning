package Sample07;

public class Synch {

    public static void main(String args[]) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Добро пожаловать");
        Caller obj2 = new Caller(target, "в синхронизированный");
        Caller objЗ = new Caller(target, "мир!");

        try {
            obj1.thread.join();
            obj2.thread.join();
            objЗ.thread.join();
        } catch (InterruptedException е) {
            System.out.println("Пpepвaнo");
        }
    }
}


package Sample02;

//  Создать  второй  поток  исполнения
class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        //  создать  новый,  второй  поток  исполнения
        thread = new Thread(this, "Демонстрационный поток");
        System.out.println("Дoчepний поток создан: " + thread);
        thread.start();  // запустить  поток  исполнения
    }

    //  Точка  входа  во  второй  поток  исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
           System.out.println("Дoчepний поток прерван.");
           System.out.println("Дoчepний поток завершен.");
        }

    }

}


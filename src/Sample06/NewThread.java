package Sample06;

// поток  исполнения
class NewThread implements Runnable {
    String  name;  // имя  потока  исполнения
    Thread thread;

    NewThread(String threadname) {
        name = threadname;
        thread = new Thread(this, name);
        System.out.println("Создан нoвый поток: " + thread);
        thread.start(); // запустить  поток  на  исполнение
    }

    //  Точка  входа в поток  исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("- Дoчepний поток: ["+name+"] " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("- Дoчepний поток прерван.");
            System.out.println("- Дoчepний поток завершен.");
        }

    }
}
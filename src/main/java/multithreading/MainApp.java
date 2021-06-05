package multithreading;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread1 = new Thread(new MyRunnableTask());
        Thread thread2 = new Thread(new MyRunnableTask());
        thread1.start();
        thread2.start();

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.start();*/

       /* Thread thread = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
        });
        thread.start();
        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(() -> System.out.println(1));
        thread1.setDaemon(true);
        thread1.start();*/

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        thread.start();
        thread.join();
        System.out.println("END");
    }
}

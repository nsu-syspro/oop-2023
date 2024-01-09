public class TwentyOne {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            System.out.println("T1");
        });
        t1.start();
        t1.join();
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            System.out.println("T2");
        });
        t2.start();
        t2.join();
        System.out.println("Finish");
    }
}

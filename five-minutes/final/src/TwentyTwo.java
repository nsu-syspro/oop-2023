public class TwentyTwo {

    static int j = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                j++;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                j++;
            }
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(j == 200_000);
    }
}

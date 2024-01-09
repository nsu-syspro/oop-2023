import java.util.concurrent.atomic.AtomicInteger;

public class TwentyThree {

    static AtomicInteger j = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                j.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                j.incrementAndGet();
            }
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(j.get() == 200_000);
    }

}

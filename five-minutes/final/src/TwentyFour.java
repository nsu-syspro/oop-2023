public class TwentyFour {

    private static class MyClass {
        private final int i = 42;
    }

    private MyClass myClass;

    private MyClass getInstance() {
        if (myClass == null) {
            myClass = new MyClass();
        }
        return myClass;
    }

    public static void main(String[] args) throws InterruptedException {
        // what's wrong with this code?
        TwentyFour twentyFour = new TwentyFour();
        Thread t1 = new Thread(() -> {
            System.out.println(twentyFour.getInstance().i);
        });
        Thread t2 = new Thread(() -> {
            System.out.println(twentyFour.getInstance().i);
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
    }
}

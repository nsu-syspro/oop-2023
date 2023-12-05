public class Two {

    public static void main(String[] args) {
        MyConsumer<Integer> lambda = (t) -> {
            while (true) {}
        };
        MySupplier<Integer> lambda2 = () -> {
            while (true) {}
        };
    }

    @FunctionalInterface
    interface MyConsumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    interface MySupplier<T> {
        T accept();
    }
}

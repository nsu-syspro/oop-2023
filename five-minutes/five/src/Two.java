public class Two {

    static class Box<T> {
        Box(T t) {
            this.t = t;
        }

        T get() {
            return t;
        }

        private final T t;
    }

    public static void main(String[] args) {
        Box<int> intBox = new Box<Integer>(42);
        System.out.println(intBox.get());
    }
}
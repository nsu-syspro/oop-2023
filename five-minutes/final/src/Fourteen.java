public class Fourteen {
    private static class Box<T extends Number> {
        private final T thing;

        private Box(T thing) {
            this.thing = thing;
        }

        private static<V extends Number> Box<V> create(V thing) {
            return new Box<>(thing);
        }
    }

    public static void main(String[] args) {
        Number n = 42;
//        Box<Integer> integerBox = new Box<>(n);
//        System.out.println(integerBox.thing.getClass().getCanonicalName());
    }
}
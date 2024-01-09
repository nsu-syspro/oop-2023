public class Thirteen {
    private static class Box<T extends Number> {
        private final T thing;

        private Box(T thing) {
            this.thing = thing;
        }
    }

    public static void main(String[] args) {
        Number n = Integer.valueOf(42);

        Box<Number> integerBox = new Box<>(n);
        System.out.println(integerBox.thing.getClass().getCanonicalName());
    }
}

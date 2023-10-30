public class Four {

    interface Box<T> {
        Object get();
    }

    static class IntBox implements Box<Integer> {

        private final Integer val;

        IntBox(Integer val) {
            this.val = val;
        }

        @Override
        public Integer get() {
            return val;
        }
    }

    public static void main(String[] args) {
        Box<Integer> b = new IntBox(42);
        System.out.println(b.get());
    }
}
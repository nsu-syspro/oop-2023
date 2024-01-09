public class Five {
    private static class IntBox {
        private final int i = 42;

        public IntBox() {
//            this.i = 1;
        }
    }

    public static void main(String[] args) {
        IntBox intBox = new IntBox();
        System.out.println(intBox);
    }
}
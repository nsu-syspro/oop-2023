public class Two {

    private static class IntBox {
        Integer i;

        public IntBox(Integer i) {
            this.i = i;
        }
    }

    private static void setToFortyTwo(IntBox intBox) {
        intBox.i = Integer.valueOf(42);
    }

    public static void main(String[] args) {
        IntBox intBox = new IntBox(1);
        setToFortyTwo(intBox);
        System.out.println(intBox.i);
    }
}
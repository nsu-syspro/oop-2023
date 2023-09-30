public class One {

    private static int i;
    private int j;

    public static class Nested {
        private void foo() {
            System.out.println(i);
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.foo();
    }
}

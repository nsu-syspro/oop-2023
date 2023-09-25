    public class Three {

        public static void foo(int j) {
            final int number;
            if (j == 0) {
                number = 42;
            } else if (j >= 10) {
                number = 10;
            } else {
                // always ends the program
                throw new IllegalStateException("should not reach!");
            }
            System.out.println(number);
        }

        public static void main(String[] args) {
            foo(42);
        }
    }

public class Seven {

    private interface I1 {
        void doSmth();
    }
    private interface I2 {
        default void doSmth() {
            System.out.println("I2.doSmth!");
        }
    }
    private static abstract class Parent {
        void doSmth() {
            System.out.println("Parent.doSmth!");
        }
    }

    private static class Child extends Parent implements I1, I2 {
        @Override
        public void doSmth() {
            System.out.println("doSmth!");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doSmth();
    }
}
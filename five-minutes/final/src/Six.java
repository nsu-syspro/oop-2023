public class Six {

    private static final class MyClass extends MyParent {
        @Override
        void doSmth() {
            System.out.println("doSmth");
        }
    }

    private static abstract class MyParent {
        abstract void doSmth();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doSmth();
    }

}
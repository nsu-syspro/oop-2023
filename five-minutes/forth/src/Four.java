public class Four {
    public static void main(String[] args) {
        C c = new C() {
            @Override
            void bar() {
                System.out.println("Hello!");
            }
        };
        c.foo();
    }
}

abstract class C {
    final void foo() {
        System.out.println("World!");
    }

     final abstract void bar();
}

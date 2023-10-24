public class Two {
    public static void main(String[] args) {
        I i = new I() {
            @Override
            public void bar() {
                System.out.println("World!");
            }
        };
        i.foo();
    }
}

interface I {
    default void foo() {
        bar();
        baz();
    }

    void bar();

    static void baz() {
        System.out.println("Hello!");
    }
}

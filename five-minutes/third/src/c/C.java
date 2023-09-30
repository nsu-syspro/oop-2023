package c;

import a.A;
import a.b.B;

public class C {
    public void baz() {
        A a = new A();
        a.foo();
        B b = new B();
        b.bar();
        m();
    }

    private void m() {
        baz();
    }
}
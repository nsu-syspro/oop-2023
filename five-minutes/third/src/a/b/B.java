package a.b;

import a.A;
import c.C;

public class B {
    void bar() {
        A a = new A();
        a.foo();
        C c = new C();
        c.baz();
        c.m();
    }
}
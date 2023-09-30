package a;

import a.b.B;
import c.C;

public class A {
    void foo() {
        B b = new B();
        b.bar();
        C c = new C();
        c.baz();
        c.m();
    }
}
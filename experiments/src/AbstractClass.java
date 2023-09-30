public abstract class AbstractClass {
    public abstract void apply();
}

class MyChild extends AbstractClass {
    @Override
    public void apply() {

    }
}

class Test$AbstractClass$1 extends AbstractClass {
    @Override
    public void apply() {

    }
}

abstract class AbstractAbstractClass extends AbstractClass {}

class Test {
    void foo() {
        // Test$AbstractClass$1
        AbstractClass a = new AbstractClass() {
            @Override
            public void apply() {

            }
        };
    }
}

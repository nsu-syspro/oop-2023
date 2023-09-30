public enum MyEnum {
    WHILE {
        private int i;

        @Override
        public void print() {

        }
    },
    LEFT {
        @Override
        public void print() {

        }
    },
    RIGHT {
        @Override
        public void print() {

        }
    };

    public abstract void print();
}

class Test1 {
    void test() {
        MyEnum myEnum = MyEnum.WHILE;
        String name = myEnum.name();
        MyEnum[] values = MyEnum.values();
        MyEnum myEnum1 = MyEnum.valueOf("WHILE");
    }

    void test(int j) {

    }
}


abstract class MyEnum1 {
    private MyEnum1() {}

    public abstract void print();
    public abstract String name();

    public static MyEnum1 valueOf(String name) {
        if (name.equals("WHILE")) {
            return WHILE;
        }
        return null;
    }

    public static MyEnum1 WHILE = new MyEnum1() {
        @Override
        public void print() {

        }

        @Override
        public String name() {
            return "WHILE";
        }
    };
//    public static MyEnum1 BAR = new MyEnum1() {};
}

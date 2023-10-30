public class One {

    static class MyException1 extends Throwable {}
    static class MyException2 extends RuntimeException {}
    static class MyException3 extends Exception {}
    static class MyException4 extends Error {}
    static class MyException5 {}

    static void test() {
        // какие из исключений можно здесь кинуть?
        // почему нельзя кинуть остальные?
    }

    public static void main(String[] args) {
        test();
    }
}
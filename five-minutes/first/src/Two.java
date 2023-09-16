public class Two {

    // найдите все проблемы в коде? что будет, после запуска этой программы?

    private int f;

    private static Two foo() {
        Two two = new Two(10);
        this.f = 42;
        return two;
    }

    public Two(int f) {
        f = f;
    }

    public static void main(String[] args) {
        Two two = foo();
        System.out.println(two.f);
    }
}

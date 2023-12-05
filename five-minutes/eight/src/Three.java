import java.util.function.IntSupplier;

public class Three {

    static Integer i2 = 42;
    static Integer i1 = 42;

    public static void main(String[] args) {
        IntSupplier s1 = Three.i1::intValue;
        IntSupplier s2 = () -> i2.intValue();
        i1++;
        i2++;
        System.out.println(s1.getAsInt());
        System.out.println(s2.getAsInt());
    }
}
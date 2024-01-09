import java.util.function.Supplier;

public class Ten {

    public static void main(String[] args) {
        Supplier<String> s1 = () -> "hello";
        Supplier<String> s2 = () -> "hello";
        System.out.println(s1.equals(s2));
    }
}

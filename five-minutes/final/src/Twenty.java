import java.util.Arrays;
import java.util.stream.Stream;

public class Twenty {
    public static void main(String[] args) {
        System.out.println(Stream.of("one", "two", "three").filter(s -> s.length() > 3).count());
    }
}

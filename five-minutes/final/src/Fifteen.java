import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Fifteen {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("one", "two", "three");
        for (Iterator<String> iterator = numbers.iterator(); iterator.hasNext(); ) {
            String number = iterator.next();
            if (number.equals("two")) {
                iterator.remove();
            }
            System.out.println(number);
        }
    }
}

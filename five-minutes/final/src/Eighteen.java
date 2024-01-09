import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Eighteen {

    // which method would be faster for collection with size=100_000?
    List<String> removeDuplicates1(Collection<String> collection) {
        List<String> noDuplicates = new ArrayList<>();
        OUTER: for (String s : collection) {
            for (String found : noDuplicates) {
                if (found.equals(s)) continue OUTER;
            }
            noDuplicates.add(s);
        }
        return noDuplicates;
    }

    List<String> removeDuplicates2(Collection<String> collection) {
        return new ArrayList<>(new HashSet<>(collection));
    }

    public static void main(String[] args) {

    }
}

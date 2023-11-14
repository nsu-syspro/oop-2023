import java.util.*;
import java.util.function.BiFunction;

public class CollectionUtils {

    private CollectionUtils() {
    }

    /**
     * Creates a reverse iterator.
     * <br/>
     * Note that after calling this method original iterator is invalidated.
     */
    public static <T> Iterator<T> reverse(Iterator<T> iterator) {
        // TODO
    }

    /**
     * Creates a reverse iterator based on given list iterator.
     * <br/>
     * This is a version of a {@link #reverse(Iterator)} with less memory consumption.
     * <br/>
     * Note that after calling this method original iterator is invalidated.
     */
    public static <T> Iterator<T> listReverse(ListIterator<T> iterator) {
        // TODO
    }

    /**
     * Creates an iterator that runs given iterators sequentially.
     * <br/>
     * It is expected that original iterators are not used after this method has been called.
     */
    @SafeVarargs
    public static <T> Iterator<T> sequenced(Iterator<T> first, Iterator<T>... rest) {
        // TODO
    }

    /**
     * Zips two collections into one.
     * If given collections have different size - throws IllegalArgumentException.
     * <p/>
     * Example:
     * <br/>
     * <pre>
     * Collection<Integer> result = zip(List.of(1, 2, 3), List.of(3, 4, 5), (i, j) -> i * j);
     * for (Integer i : result) {
     *   System.out.println(result);
     * }
     * </pre>
     * Output:
     * <pre>
     * 3
     * 8
     * 15
     * </pre>
     */
    public static<T, V, U> Collection<U> zip(Collection<T> first,
                                             Collection<V> second,
                                             BiFunction<T, V, U> converter) {
        // TODO
    }
}
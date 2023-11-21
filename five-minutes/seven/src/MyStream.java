import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 Write your own stream class. (5 points in total)
 Supported operations:
 1. map
 2. filter
 3. flatMap
 4. forEach
 5. of(T...)

 Hint: you would need to use classes from package java.util.function
 Hint: there might be some warnings in your code, it's fine
 Please note that you cannot use a regular java.util.Stream inside your class.
*/
public class MyStream<T> {

    static <U> MyStream<U> of(U... values) {
        // TODO
    }

    public static void main(String[] args) {

    }

    <V> MyStream<V> map(Function<T, V> mapper) {
        // TODO
    }

    MyStream<T> filter(Predicate<T> predicate) {
        // TODO
    }

    <V> MyStream<V> flatMap(Function<T, MyStream<V>> flatMapper) {
        // TODO
    }

    void forEach(Consumer<T> consumer) {
        // TODO
    }
}
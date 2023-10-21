import java.util.ArrayList;
import java.util.List;

public class Seven {
  // write method: boolean contains(T what, List<T>... objs) {}
  @SafeVarargs
  public static <T> boolean contains(T what, List<T>... lists) {
    for (List<T> list : lists) {
      if (list.contains(what)) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(contains("foo", List.of("bar"), List.of("foo")));
  }
}
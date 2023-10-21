import java.util.Collection;
import java.util.Iterator;

public class Four {
  // write util method max(Collection<E>)
  private static<E extends Comparable<E>> E max(Collection<E> collection) {
    Iterator<E> iterator = collection.iterator();
    E max = null;
    while (iterator.hasNext()) {
      E next = iterator.next();
      if (max == null || next.compareTo(max) > 0) {
        max = next;
      }
    }
    return max;
  }
}

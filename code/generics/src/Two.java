import java.util.Arrays;

public class Two {

  public interface Comparable {
    int compareTo(Object box);
  }

  // compare two boxes using 'int compareTo(Box)'. Then rewrite with Comparable
  private static class Box implements Comparable {

    private final Comparable thing;

    private Box(Comparable thing) {
      this.thing = thing;
    }

    public static Box create(Comparable thing) {
      return new Box(thing);
    }

    public Comparable getThing() {
      return thing;
    }

    public int compareTo(Box box) {
      return thing.compareTo(box.thing);
    }

    @Override
    public int compareTo(Object box) {
      return compareTo((Box) box);
    }
  }

  public static void main(String[] args) {
//    Box strBox = Box.create("foo");
//    Box intBox = Box.create(42);
//    String s = (String) strBox.getThing();
//    strBox.compareTo(intBox);
//    intBox.compareTo(intBox);
    Arrays.stream(Box.class.getDeclaredMethods()).forEach(System.out::println);

  }


}

public class One {
  // Box - wrapper for any object

  private static class Box<T> {
    private final T thing;

    private Box(T thing) {
      this.thing = thing;
    }

    public T getThing() {
      return thing;
    }
  }

  public static void main(String[] args) {
    var intBox = new Box<>(args);
    Box box = new Box(42);
    box = intBox;
    Object thing = box.getThing();
    Box<String> strBox = new Box<>("hello");
//    int i = intBox.getThing();
    String str = getStrBoxThing(strBox);
    System.out.println(str);
//    System.out.println(i);
  }

  private static String getStrBoxThing(Box<String> strBox) {
    return strBox.getThing();
  }
}

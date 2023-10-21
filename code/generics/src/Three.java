public class Three {
  // inherit generic base class BaseThing<T> with Number
  private static class BaseThing<T> {}

  private static class NumberThing extends BaseThing<Number> {}
}

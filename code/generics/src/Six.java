public class Six {
  // implement compareTo for these classes:
  // Product(int price), Camera(String brand) extends Product, Phone extends Product
  private static class Product<T extends Product<T>> implements Comparable<T> {
    protected final int price;

    private Product(int price) {
      this.price = price;
    }

    @Override
    public int compareTo(T o) {
      return Integer.compare(price, o.price);
    }
  }

  private static class Camera extends Product<Camera> {
    private final String brand;

    private Camera(int price, String brand) {
      super(price);
      this.brand = brand;
    }

    @Override
    public int compareTo(Camera o) {
      int i = brand.compareTo(o.brand);
      if (i != 0) return i;
      return super.compareTo(o);
    }
  }

  private static class Phone extends Product<Phone> {
    private Phone(int price) {
      super(price);
    }
  }
}

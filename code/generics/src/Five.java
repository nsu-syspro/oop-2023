import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Five {
  // write append for two lists

  // PECS = producer extends consumer super
  public static <T> void append(List<? super T> dst, List<? extends T> src) {
    dst.addAll(src);
  }

  private static class Parent {}
  private static class Child extends Parent {}
  private static class EvilChild extends Parent {}
  private static class GrandChild extends Child {}

  public static void main(String[] args) {
//    {
//      List<Parent> parents = new ArrayList<>();
//      List<Child> children = new ArrayList<>();
//      List<GrandChild> grandChildren = new ArrayList<>();
//      Five.<Child>append(parents, grandChildren);  // error
//      append(children, parents);  // error
//
//      parents.addAll(children);  // ok
//      children.addAll(parents);  // error
//    }
//    {
//      List<Parent> parents = new ArrayList<>();
//      List<Child> children = new ArrayList<>();
//      List someList = children;
//      parents = someList;
//
//      parents.add(new EvilChild());
//      Child child = children.get(0);
//    }
//    {
//      Parent[] parents = new Parent[10];
//      Child[] children = new Child[10];
//      // covariance
//      parents = children;   // ok
//      children = parents;   // not ok
//    }
//
//    // invariance
//
//    {
//      List<? extends Parent> parents = new ArrayList<>();
//      List<Child> children = new ArrayList<>();
//      // covariance
//      parents.add(null);
//      Parent parent = parents.get(0);
//      parents = children;
//    }
//
//    // contravariance
//    List<? super Parent> parents = new ArrayList<>();
//    List<Object> objects = new ArrayList<>();
//    parents = objects;
//    parents.add(new EvilChild());
//
  }


}

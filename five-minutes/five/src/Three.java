import java.util.ArrayList;
import java.util.List;

public class Three {

    static void test(List<Integer> list, List<Object> objectList, ArrayList<Integer> arrayList) {
        // какие из этих присваиваний скомпилируются?
        list = new ArrayList<Integer>();
        list = new ArrayList<Object>();
        list = objectList;
        objectList = list;

        arrayList = list;
        arrayList = objectList;
        arrayList = new ArrayList<Integer>();
        arrayList = new ArrayList<Object>();

        arrayList = (ArrayList<Integer>) objectList;
        arrayList = (ArrayList<Integer>) list;
    }
}
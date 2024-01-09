import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Seventeen {


    public static void main(String[] args) {

        List<String> l1 = new LinkedList<>(Arrays.asList(getArray(100_000)));
        List<String> l2 = new ArrayList<>(Arrays.asList(getArray(100_000)));

        // which operation will be faster and why?

        // 1
        l1.get(1500);
        // 2
        l2.get(1500);
    }

    private static String[] getArray(int size) {
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
}
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] i = {42};
        Runnable r = () -> {
            i[0]++;
        };
        r.run();
        System.out.println(Arrays.toString(i));
    }
}
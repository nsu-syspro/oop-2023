public class One {
    private static void setToFortyTwo(Integer integer) {
        integer = Integer.valueOf(42);
    }

    public static void main(String[] args) {
        int i = 1;
        setToFortyTwo(i);
        System.out.println(i);
    }
}
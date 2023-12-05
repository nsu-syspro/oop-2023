public class Four {

    public static void main(String[] args) {
        int i = 42;
        Runnable r = () -> i++;
        r.run();
        System.out.println(i);
    }
}

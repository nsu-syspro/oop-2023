public class One {

    public static void main(String[] args) {
        System.out.println(classic("hello") + modern("!"));
    }

    static int modern(String s) {
        return switch (s) {
            case "hello": {
                42;
            }
            case "world": {
                yield 1;
            }
            default: {
                yield 10;
            }
        };
    }

    static int classic(String s) {
        switch (s) {
            case "hello": return 42;
            case "world": return 1;
        }
        return 10;
    }

}

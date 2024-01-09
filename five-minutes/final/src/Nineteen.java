public class Nineteen {
    @FunctionalInterface
    private interface MyI {
        String doSmth(String s);

        default int getLenAfter(String s) {
            return doSmth(s).length();
        }
    }

    public static void main(String[] args) {
        MyI myI = String::trim;
        System.out.println(myI.getLenAfter(" foo "));
    }
}

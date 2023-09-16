public class One {

    // что здесь не скомпилируется и почему?

    private static int STATIC_FIELD;
    private int nonStaticField;

    private void nonStaticMethod() {
        int nonStaticField1 = this.nonStaticField;
        int i = STATIC_FIELD;
        i = nonStaticField;
    }

    // staticMethod(new One())
    private static void staticMethod() {
        int i = STATIC_FIELD;
        // i = one.nonStaticField;
        i = one.nonStaticField;
    }

    public static void main(String[] args) {
         staticMethod();
         this.nonStaticMethod();
    }
}

public class One {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("Hello world", '!'));
    }

    public static String replaceSpaces(String original, char replaceWith) {
        original.replace(' ', replaceWith).toLowerCase();
        return original;
    }
}

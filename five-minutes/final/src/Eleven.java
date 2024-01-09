import java.io.IOException;
import java.io.UncheckedIOException;

public class Eleven {
    private static class MyException extends IOException {}

    public static void main(String[] args) {
        try {
            doSmth();
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
    }

    static void doSmth() {
        try {
            throw new MyException();
        } catch (IOException e) {
            System.out.println("Exception!");
            throw new UncheckedIOException(e);
        } catch (Error e) {
            System.out.println("Error!");
        }
    }
}

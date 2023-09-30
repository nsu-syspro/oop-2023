import java.io.IOException;

public class MyException {

    /*

    Throwable
      - Error
      - Exception

    - checked
    - unchecked

    RuntimeException | Error -> unchecked
    Exception & !RuntimeException | Throwable -> checked


     */

    public static void m() {
        throw new MyNewException();
    }

    private static class MyNewException extends Error {}

}

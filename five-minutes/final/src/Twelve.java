import java.io.IOException;

public class Twelve {

    private static class MyException extends IOException {}

    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (IOException e) {
            System.out.println("IOException!");
        } catch (Exception e) {
            System.out.println("Exception!");
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("After finally!");
    }
}

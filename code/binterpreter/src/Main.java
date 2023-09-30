import java.util.Scanner;

public class Main {

    /*
     [0-255] [0][0][0][][][][][][][][][]...[] <- 30_000
      ^

     > - move caret right
     < - move caret left
     + - inc number in cell
     - - dec number in cell
     . - print as ascii
     , - read char from input and put it into the current cell
     [ - ...
     ] - ...
     */

    public static void main(String[] args) {
        if (args.length >= 2) {
            System.err.println("Too many arguments");
            System.err.println("Usage: binterpreter [-p]");
            return;
        }
        if (args.length == 1) {
            String s1 = "-p";
            if (!s1.equals(args[0])) {
                System.err.println("Unknown argument: " + args[0]);
                System.err.println("Usage: binterpreter [-p]");
                return;
            }
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Interpreter interpreter = new Interpreter();
        while (true) {
            String line = scanner.nextLine();
            try {
                interpreter.interpret(line);
            } catch (InterpreterException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}


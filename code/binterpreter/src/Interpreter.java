import java.util.ArrayList;
import java.util.List;

public class Interpreter {

    private final Context ctx = new Context(0, new char[30_000]);
    private int posInLine;

    public void interpret(String line) {
        posInLine = 0;
        List<Command> commands = getCommands(line);
        if (commands == null) {
            return;
        }
        for (Command command : commands) {
            command.apply(ctx);
        }
    }

    private List<Command> getCommands(String line, char... stopAt) {
        List<Command> commands = new ArrayList<>();
        while (posInLine < line.length()) {
            char c = line.charAt(posInLine);
            for (char toStop : stopAt) {
                if (c == toStop) {
                    return commands;
                }
            }
            Command cmd = getCommand(line, c);
            if (cmd == null) {
                throw new InterpreterException("Unknown symbol '" + c + "' at " + posInLine);
            }
            commands.add(cmd);
            posInLine++;
        }

        if (stopAt.length != 0) {
            throw new InterpreterException("Couldn't find one of stop symbols: ");
        }
        return commands;
    }

    private Command getCommand(String line, char c) {
        return switch (c) {
            case '>' -> new Right();
            case '+' -> new Plus();
            case '.' -> new Print();
            case '-' -> new Minus();
            case '[' -> {
                posInLine++;
                List<Command> body = getCommands(line, ']');
                if (body == null) {
                    yield null;
                }
                yield new While(body);
            }
            default -> null;
        };
    }
}

import java.util.List;

public class While implements Command {

    private final List<Command> body;

    public While(List<Command> body) {
        this.body = body;
    }

    @Override
    public void apply(Context ctx) {
        while (ctx.cells[ctx.pos] != 0) {
            for (Command command : body) {
                command.apply(ctx);
            }
        }
    }

    @Override
    public String print() {
        return null;
    }
}

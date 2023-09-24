public class Minus implements Command {
    @Override
    public void apply(Context ctx) {
        ctx.cells[ctx.pos]--;
    }

    @Override
    public String print() {
        return null;
    }
}

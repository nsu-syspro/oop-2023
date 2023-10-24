public class Three {
}

sealed interface Command {
    int apply();

    default Command create(String name, int a, int b) {
        if (name.equals("Plus")) {
            return new Plus(a, b);
        }
        if (name.equals("Minus")) {
            return new Minus(a, b);
        }
        return null;
    }
}

class Plus implements Command {

    private final int a;
    private final int b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int apply() {
        return a + b;
    }
}

final class Minus implements Command {

    private final int a;
    private final int b;

    public Minus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int apply() {
        return a - b;
    }
}
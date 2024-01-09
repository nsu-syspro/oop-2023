public class Eight {

    enum Command {
        LIST,
        REGISTER,
        MESSAGE,
        DISCONNECT
    }

    public static void main(String[] args) {
        Command command = getCommand(2);
        System.out.println(command);
    }

    private static Command getCommand(int n) {
        Command[] values = Command.values();
        return values[n];
    }
}
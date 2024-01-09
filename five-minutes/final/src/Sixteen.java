import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sixteen {

    private static class User {
        private final String name;

        private User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("peter"));
        users.add(new User("peter"));
        System.out.println(users.size());
    }
}

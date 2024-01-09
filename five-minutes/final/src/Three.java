public class Three {


    public static void main(String[] args) {
        Player player = new OptimalPlayer();
        player.move();
    }
}

abstract class Player {
    void move() {
        System.out.println("Player move!");
    }
}
class OptimalPlayer extends Player {
    @Override
    void move() {
        System.out.println("Optimal move!");
    }
}
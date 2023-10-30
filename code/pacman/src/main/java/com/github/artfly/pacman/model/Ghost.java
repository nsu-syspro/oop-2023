package com.github.artfly.pacman.model;

public class Ghost {
    // color, x, y, direction
    private final Color color;
    private int x;
    private int y;
    private Direction direction;

    public Ghost(Color color, int x, int y, Direction direction) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
        // TODO: check if we out of bounds
    }
}

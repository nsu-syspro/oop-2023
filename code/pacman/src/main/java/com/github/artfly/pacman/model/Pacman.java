package com.github.artfly.pacman.model;

public class Pacman {
    private Coord coord;
    private Direction direction;
    private int lives;

    public Pacman(Coord coord, Direction direction, int lives) {
        this.coord = coord;
        this.direction = direction;
        this.lives = lives;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Coord move() {
        return coord.move(direction);
        // TODO: check if we out of bounds
    }
}

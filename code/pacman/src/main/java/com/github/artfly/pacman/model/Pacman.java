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
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
        // TODO: check if we out of bounds
    }
}

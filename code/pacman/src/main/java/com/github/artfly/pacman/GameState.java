package com.github.artfly.pacman;

public record GameState(int score, int lives, GameObject[][] cells) {
    public enum GameObject {
        PACMAN,
        GHOST,
        FOOD,
        BARRIER,
        EMPTY
    }
}

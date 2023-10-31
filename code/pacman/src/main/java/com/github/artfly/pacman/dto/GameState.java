package com.github.artfly.pacman.dto;

import static com.github.artfly.pacman.dto.GameObject.*;

public record GameState(int score, int lives, GameObject[][] cells) {

    public static GameState initial() {
        GameObject[][] cells = {
                {
                        BARRIER, BARRIER, BARRIER, BARRIER, BARRIER
                },
                {
                        BARRIER, FOOD, FOOD, FOOD, BARRIER,
                },
                {
                        BARRIER, FOOD, FOOD, FOOD, BARRIER
                },
                {
                        BARRIER, FOOD, PACMAN, FOOD, BARRIER,
                },
                {
                        BARRIER, FOOD, FOOD, FOOD, BARRIER,
                },
                {
                        BARRIER, BARRIER, BARRIER, BARRIER, BARRIER
                }
        };

        return new GameState(0, 3, cells);
    }
}

package com.github.artfly.pacman.model;

import com.github.artfly.pacman.dto.GameObject;
import com.github.artfly.pacman.dto.GameState;

import java.util.ArrayList;
import java.util.List;

public class Field {

    /*
    barrier ('b'), food ('f'), empty (' '), pacman('p'), ghost ('g')
    */
    private final Cell[][] cells;
    private final List<Ghost> ghosts;
    private final Pacman pacman;
    private int score;

    private Field(Cell[][] cells, List<Ghost> ghosts, Pacman pacman, int score) {
        this.cells = cells;
        this.ghosts = ghosts;
        this.pacman = pacman;
        this.score = score;
    }

    public static Field create(GameState initial) {
        int lives = initial.lives();
        int score = initial.score();
        GameObject[][] initialCells = initial.cells();
        Cell[][] cells = new Cell[initialCells.length][initialCells[0].length];
        List<Ghost> ghosts = new ArrayList<>();
        Pacman pacman = null;
        for (int x = 0; x < initialCells.length; x++) {
            for (int y = 0; y < initialCells[x].length; y++) {
                GameObject gameObject = initialCells[x][y];
                switch (gameObject) {
                    case PACMAN -> {
                        assert pacman != null;
                        pacman = new Pacman(new Coord(x, y), null, lives);
                    }
                    case GHOST -> {
                        ghosts.add(new Ghost(Color.randomColor(), x, y, null));
                    }
                    case FOOD -> {
                        cells[x][y] = Cell.FOOD;
                    }
                    case BARRIER -> {
                        cells[x][y] = Cell.BARRIER;
                    }
                    case EMPTY -> {
                        cells[x][y] = Cell.EMPTY;
                    }
                }
            }
        }
        return new Field(cells, ghosts, pacman, score);
    }

    public void moveAll() {
        for (Ghost ghost : ghosts) {
            ghost.move();
        }

        Coord coord = pacman.move();
        if (hasFoodAt(coord)) {
            cells[coord.x()][coord.y()] = Cell.EMPTY;
        }

        checkCollisions();
    }

    private void checkCollisions() {
        // TODO
    }

    private boolean hasFoodAt(Coord coord) {
        return cells[coord.x()][coord.y()] == Cell.FOOD;
    }

    public void setPacmanDirection(Direction direction) {
        pacman.setDirection(direction);
    }

    public GameState getGameState() {
        // TODO
        return GameState.initial();
    }
}

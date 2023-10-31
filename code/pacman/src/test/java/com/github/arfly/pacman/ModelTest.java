package com.github.arfly.pacman;

import com.github.artfly.pacman.dto.GameObject;
import com.github.artfly.pacman.dto.GameState;
import com.github.artfly.pacman.model.Direction;
import com.github.artfly.pacman.model.Field;
import org.junit.Test;

import static com.github.artfly.pacman.dto.GameObject.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModelTest {

    @Test
    public void foodConsumed() {
        GameObject[][] cells = {
                {
                    PACMAN,
                    FOOD
                }
        };
        GameState gameState = new GameState(0, 1, cells);
        Field field = Field.create(gameState);
        field.setPacmanDirection(Direction.RIGHT);
        field.moveAll();
        GameState actual =field.getGameState();
        assertEquals(1, actual.score());
        assertEquals(1, actual.lives());
        GameObject[][] expectedCells = {
                {
                        EMPTY,
                        PACMAN
                }
        };
        GameState expected = new GameState(1, 1, expectedCells);
        assertEquals(actual, expected);
    }
}

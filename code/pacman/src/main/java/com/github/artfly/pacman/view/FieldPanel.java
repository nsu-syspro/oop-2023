package com.github.artfly.pacman.view;

import com.github.artfly.pacman.dto.GameObject;
import com.github.artfly.pacman.dto.GameState;
import com.github.artfly.pacman.utils.ImageUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FieldPanel extends JPanel {

    private final Image pacmanRight = ImageUtils.loadImage("pacman_right.jpg");
    private GameState gameState;

    FieldPanel(GameState gameState) {
        this.gameState = gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        drawField();
//        drawPacman();
        for (GameObject[] row : gameState.cells()) {
            for (GameObject cell : row) {
                switch (cell) {
                    case PACMAN -> drawPacman()
                }
            }
        }
        g.drawImage(pacmanRight, 0, 0, 120, 150, null);
    }
}

package com.github.artfly.pacman.view;

import com.github.artfly.pacman.dto.GameState;
import com.github.artfly.pacman.model.Direction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;

public class PacmanFrame extends JFrame {

    private final FieldPanel fieldPanel;

    public PacmanFrame(PacmanMoveListener moveListener, GameState initial) {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case VK_UP:
                        moveListener.onPacmanMove(Direction.UP);
                    case VK_DOWN:
                        moveListener.onPacmanMove(Direction.DOWN);
                    case VK_LEFT:
                        moveListener.onPacmanMove(Direction.LEFT);
                    case VK_RIGHT:
                        moveListener.onPacmanMove(Direction.RIGHT);
                }
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(600, 600));

        this.fieldPanel = new FieldPanel(initial);
        setContentPane(fieldPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setGameState(GameState gameState) {
        fieldPanel.setGameState(gameState);
    }
}

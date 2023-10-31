package com.github.artfly.pacman.controller;

import com.github.artfly.pacman.model.Direction;
import com.github.artfly.pacman.model.Field;
import com.github.artfly.pacman.view.PacmanFrame;
import com.github.artfly.pacman.view.PacmanMoveListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacmanController implements PacmanMoveListener {

    private final Field field;
    private PacmanFrame frame;
    Timer timer = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.moveAll();
            frame.setGameState(field.getGameState());
//            System.out.println("Hello!");
        }
    });

    public PacmanController(Field field) {
        this.field = field;
    }

    public void setFrame(PacmanFrame frame) {
        this.frame = frame;
    }

    public void start() {
        onPacmanMove(Direction.LEFT);
        timer.start();
    }

    @Override
    public void onPacmanMove(Direction direction) {
        field.setPacmanDirection(direction);
    }
}

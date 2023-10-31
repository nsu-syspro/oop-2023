package com.github.artfly.pacman;

import com.github.artfly.pacman.controller.PacmanController;
import com.github.artfly.pacman.dto.GameState;
import com.github.artfly.pacman.model.Field;
import com.github.artfly.pacman.view.PacmanFrame;

public class Main {
    public static void main(String[] args) {
        GameState initial = GameState.initial();
        Field field = Field.create(initial);
        PacmanController controller = new PacmanController(field);
        PacmanFrame frame = new PacmanFrame(controller, initial);
        controller.setFrame(frame);
        controller.start();
    }
}

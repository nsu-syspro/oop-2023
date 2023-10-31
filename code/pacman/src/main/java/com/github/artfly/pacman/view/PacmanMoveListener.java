package com.github.artfly.pacman.view;

import com.github.artfly.pacman.model.Direction;

public interface PacmanMoveListener {
    void onPacmanMove(Direction direction);
}

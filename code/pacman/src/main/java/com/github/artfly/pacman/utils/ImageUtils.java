package com.github.artfly.pacman.utils;

import com.github.artfly.pacman.view.FieldPanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

public class ImageUtils {

    public static Image loadImage(String fName) {
        try {
            URL imgUrl = FieldPanel.class.getResource("/" + fName);
            if (imgUrl == null) {
                throw new FileNotFoundException("Couldn't find resource " + fName);
            }
            return ImageIO.read(imgUrl);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

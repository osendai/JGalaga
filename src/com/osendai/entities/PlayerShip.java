package com.osendai.entities;

/**
 * Player object for Galaga application
 *
 * @author Scott! Williams
 */

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class PlayerShip extends Sprite {

    private int x = 300;

    private final int y = 710;

    private int dx;

    private int w;

    private int h;

    private Image image;

    public PlayerShip() {
        loadAsset();
    }

    public void loadAsset() {
        ImageIcon icon = new ImageIcon("src/com/osendai/entities/assets/playerShip0.png");
        image = icon.getImage();

        w = image.getWidth(null);
        h = image.getHeight(null);
    }

    public void move() {
        if ((x + dx) >= (700 - image.getWidth(null)) || (x + dx) <= 0){
            dx = 0;
        }
        x += dx;
    }

    public void fire() {
        // TODO
    }

    public void keyPress(KeyEvent e) {
        int k = e.getKeyCode();

        switch (k){
            case KeyEvent.VK_A: dx = -2;
                break;
            case KeyEvent.VK_D: dx = 2;
                break;
        }
    }

    public void keyRelease(KeyEvent e) {
        int k = e.getKeyCode();

        switch (k){
            case KeyEvent.VK_A: dx = 0;
                break;
            case KeyEvent.VK_D: dx = 0;
                break;
        }
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}

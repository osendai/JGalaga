package com.osendai.entities;

/**
 * Sprite parent object for sprite entities in Galaga application
 *
 * @author Scott! Williams
 */

import javax.swing.*;
import java.awt.Image;

public class Sprite {

    /**
     * X coordinate
     */
    private int x;

    /**
     * Y coordinate
     */
    private int y;

    /**
     * Velocity on x plane
     */
    private int dx;

    /**
     * Velocity on y plane
     */
    private int dy;

    /**
     * Sprite width
     */
    private int w;

    /**
     * Sprite height
     */
    private int h;

    /**
     * Sprite image
     */
    private Image image;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public Image getImage() {
        return image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void loadAsset(String s){
        ImageIcon ii = new ImageIcon(s);
        image = ii.getImage();

        w = image.getWidth(null);
        h = image.getHeight(null);
    }
}

package com.osendai.main;

/**
 * Graphics code for Galaga application
 *
 * @author Scott! Williams
 */

import com.osendai.entities.PlayerShip;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI extends JPanel implements ActionListener {

    private PlayerShip playerShip;

    private Timer timer;

    private final int DELAY = 10;

    public GUI() {
        initDisplay();
    }

    private void initDisplay() {
        addKeyListener(new TAdapter());
        setBackground(Color.BLACK);
        setFocusable(true);

        playerShip = new PlayerShip();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(playerShip.getImage(), playerShip.getX(), playerShip.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        step();
    }

    private void step() {
        playerShip.move();

        repaint(playerShip.getX() - 10, playerShip.getY() - 10,
                playerShip.getW() + 20, playerShip.getH() + 20);
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            playerShip.keyRelease(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            playerShip.keyPress(e);
        }
    }
}

package com.osendai.main;

/**
 * Driver code for Galaga application
 *
 * @author Scott! Williams
 */

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        initGUI();
    }

    private void initGUI() {
        add(new GUI());

        setTitle("Galaga");
        setSize(700, 900);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application app = new Application();
            app.setVisible(true);
        });
    }
}

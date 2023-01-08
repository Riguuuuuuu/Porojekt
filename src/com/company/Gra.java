package com.company;

import javax.swing.*;

public class Gra extends JFrame {

    ImagePanel image_panel= new ImagePanel();
    Skalowanie_wszystkiego skalowanie_wszystkiego = new Skalowanie_wszystkiego();

    Gra(){
        final int width = 1280;
        final int height = 1024;

        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);

        setLayout(null);

        setTitle("Dustman_the_game");

        JPanel panel = new JPanel();
        panel.setSize(1280, 1024);

        skalowanie_wszystkiego.Skalowanie();
        image_panel.Nadaj_kordynaty();

        add(panel);

        image_panel.Panel();

        panel.add(image_panel);

        setVisible(true);
    }
}

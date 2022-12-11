package com.company;

import javax.swing.*;

public class Ustawienia extends JFrame {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Tu bedzia ustawienia");

    Ustawienia() {
        setSize(1280, 1024);
        setTitle("Dustman_the_game_settings");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        label.setBounds(0, 0, 100, 50);
        add(label);
    }
}

package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ustawienia extends JFrame implements ActionListener {


    ImageIcon ITlo = new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Tlo.png");

    JLabel background;

    JRadioButton Latwy;
    JRadioButton Normalny;
    JRadioButton Trudny;

    private JButton Powrot;

    static int poziomtrudnosci = 1;

    Ustawienia() {
        final int width = 1280;
        final int height = 1024;

        setSize(width, height);
        setTitle("Dustman_the_game_settings");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Latwy = new JRadioButton("Latwy", true);
        Latwy.setBounds(100, 100, 100, 20);
        Latwy.setOpaque(false);

        Normalny = new JRadioButton("Normalny", false);
        Normalny.setBounds(300, 100, 100, 20);
        Normalny.setOpaque(false);

        Trudny = new JRadioButton("Trudny", false);
        Trudny.setBounds(500, 100, 100, 20);
        Trudny.setOpaque(false);

        ButtonGroup PoziomyTrudnosci = new ButtonGroup();

        PoziomyTrudnosci.add(Latwy);
        PoziomyTrudnosci.add(Normalny);
        PoziomyTrudnosci.add(Trudny);

        Latwy.addActionListener(this);
        Normalny.addActionListener(this);
        Trudny.addActionListener(this);

        add(Latwy);
        add(Normalny);
        add(Trudny);

        Powrot = new JButton("Ustawienia");
        Powrot.setBounds(440, 370, 400, 200);
        Powrot.setBorderPainted(false);
        Powrot.setContentAreaFilled(false);
        Powrot.setFocusPainted(false);
        Powrot.setOpaque(false);
        add(Powrot);
        Powrot.addActionListener(this);

        background = new JLabel("", ITlo, JLabel.CENTER);
        background.setBounds(0, 0, 1280, 1024);
        add(background);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Latwy) {
            poziomtrudnosci = 1;
        } else if (e.getSource() == Normalny) {
            poziomtrudnosci = 2;
        } else if (e.getSource() == Trudny) {
            poziomtrudnosci = 3;
        } else if (e.getSource() == Powrot) {
            Main dustman = new Main();
            dustman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dustman.setVisible(true);
            setVisible(false);
        }
    }
}

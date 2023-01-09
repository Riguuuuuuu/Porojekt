package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Okno ustawien gry edukacyjnej.
 * @author Przemyslaw Winiarski
 */
public class Ustawienia extends JFrame implements ActionListener {

    /** Zdeklarowanie Radio Buttons do wyboru poziomu trudnosci. */
    final JRadioButton Latwy, Normalny, Trudny;

    /** Zdeklarowanie przycisku do powrotu do glownego menu. */
    final JButton Powrot;

    /**
     * Deklaracja wstepnych parametrow w razie nie wybrania przez uzytkowanika
     *  wlasnorecznie poziomu trudnosci.
     */
    static int poziomtrudnosci = 1,ilesmietnikoww=3,ilesmiecii=6;

    /**
     * Głowny konstruktor klasy - stworzenie Grupy RadioButtonow, w celu wyboru
     * poziomu trudnosci w grze.
     */
    Ustawienia() {
        ImageIcon ITlo = new ImageIcon("Grafika/Tlo.png");
        ImageIcon BPowrot = new ImageIcon("Grafika/Powrot.png");
        ImageIcon RLatwy = new ImageIcon("Grafika/Latwy.png");
        ImageIcon RNormalny = new ImageIcon("Grafika/Normalny.png");
        ImageIcon RTrudny = new ImageIcon("Grafika/Trudny.png");

        JLabel background;

        final int width = 1280;
        final int height = 1024;

        setSize(width, height);
        setTitle("Dustman_the_game_settings");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Latwy = new JRadioButton(RLatwy, true);
        Latwy.setBounds(100, 100, 400, 200);
        Latwy.setOpaque(false);

        Normalny = new JRadioButton(RNormalny, false);
        Normalny.setBounds(100, 300, 450, 200);
        Normalny.setOpaque(false);

        Trudny = new JRadioButton(RTrudny, false);
        Trudny.setBounds(100, 500, 400, 200);
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

        Powrot = new JButton("",BPowrot);
        Powrot.setBounds(800, 800, 400, 200);
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

    /**
     * Obsluga zdarzen - wyboru poziomu trudnosci.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Latwy) {
            poziomtrudnosci = 1;
            ilesmietnikoww=3;
            ilesmiecii=6;
        } else if (e.getSource() == Normalny) {
            poziomtrudnosci = 2;
            ilesmietnikoww=4;
            ilesmiecii=8;
        } else if (e.getSource() == Trudny) {
            poziomtrudnosci = 3;
            ilesmietnikoww=5;
            ilesmiecii=10;
        } else if (e.getSource() == Powrot) {
            Menu dustman = new Menu();
            dustman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dustman.setVisible(true);
            setVisible(false);
        }
    }
}

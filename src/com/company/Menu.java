package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Okno menu gry edukacyjnej.
 * @author Przemyslaw Winiarski
 */
public class Menu extends JFrame implements ActionListener {

    /** Zdeklarowanie przyciskow */
    final private JButton bstart, bustawienia,bwyjscie;

    /**
     * Głowny konstruktor klasy - ustawienie grafiki do przyciskow sluzacych
     * do poruszania się po grze oraz dodanie samych przyciskow.
     */
    public Menu() {
        final JLabel background;

        setSize(1280, 1024);
        setTitle("Dustman_the_game_Menu");
        setLayout(null);

        ImageIcon IStart=new ImageIcon("Grafika/Start2.png");
        ImageIcon ITlo=new ImageIcon("Grafika/Tlo.png");
        ImageIcon IUstawienia=new ImageIcon("Grafika/Ustawienia.png");
        ImageIcon IWyjscie=new ImageIcon("Grafika/Wyjscie.png");

        bstart = new JButton(IStart);
        bstart.setBounds(440, 150, 400, 200);
        bstart.setBorderPainted(false);
        bstart.setContentAreaFilled(false);
        bstart.setFocusPainted(false);
        bstart.setOpaque(false);
        add(bstart);
        bstart.addActionListener(this);

        bustawienia = new JButton("",IUstawienia);
        bustawienia.setBounds(440, 370, 400, 200);
        bustawienia.setBorderPainted(false);
        bustawienia.setContentAreaFilled(false);
        bustawienia.setFocusPainted(false);
        bustawienia.setOpaque(false);
        add(bustawienia);
        bustawienia.addActionListener(this);

        bwyjscie = new JButton("",IWyjscie);
        bwyjscie.setBounds(440, 590, 400, 200);
        bwyjscie.setBorderPainted(false);
        bwyjscie.setContentAreaFilled(false);
        bwyjscie.setFocusPainted(false);
        bwyjscie.setOpaque(false);
        add(bwyjscie);
        bwyjscie.addActionListener(this);

        background = new JLabel("",ITlo,JLabel.CENTER);
        background.setBounds(0,0,1280, 1024);
        add(background);

    }

    /**
     * Obsluga zdarzen w menu (wylacznie,rozpoczecie gry, badz przejscie do ustawien).
     */
    public void actionPerformed(ActionEvent e) {
        Object start = e.getSource();
        Object ustawienia = e.getSource();
        Object wyjscie=e.getSource();

        if (start == bstart) {
            setVisible(false);
            Gra gra = new Gra();
        }

        if (ustawienia == bustawienia) {
            setVisible(false);
            Ustawienia gra = new Ustawienia();
        }
        if(wyjscie==bwyjscie)
        {
            dispose();
        }
    }
}

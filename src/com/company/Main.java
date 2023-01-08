package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JButton bstart, bustawienia,bwyjscie;
    private JLabel lwyswietlaniemenu,background;

    public Main() {


        setSize(1280, 1024);
        setTitle("Dustman_the_game_Menu");
        setLayout(null);
        setBackground(Color.black);

        ImageIcon IStart=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Start2.png");
        ImageIcon ITlo=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Tlo.png");
        ImageIcon IUstawienia=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Ustawienia.png");
        ImageIcon IWyjscie=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Wyjscie.png");

        bstart = new JButton(IStart);
        bstart.setBounds(440, 150, 400, 200);
        bstart.setBorderPainted(false);
        bstart.setContentAreaFilled(false);
        bstart.setFocusPainted(false);
        bstart.setOpaque(false);
        add(bstart);
        bstart.addActionListener(this);

        bustawienia = new JButton("Ustawienia",IUstawienia);
        bustawienia.setBounds(440, 370, 400, 200);
        bustawienia.setBorderPainted(false);
        bustawienia.setContentAreaFilled(false);
        bustawienia.setFocusPainted(false);
        bustawienia.setOpaque(false);
        add(bustawienia);
        bustawienia.addActionListener(this);

        bwyjscie = new JButton("Wyjscie",IWyjscie);
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

        lwyswietlaniemenu = new JLabel("Pomoc:");
        lwyswietlaniemenu.setBounds(200,200,500, 500);
        add(lwyswietlaniemenu);

    }

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

    public static void main(String[] args) {

         Main dustman = new Main();
        dustman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dustman.setVisible(true);


    }
}

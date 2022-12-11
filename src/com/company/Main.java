package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main extends JFrame implements ActionListener {

    private JButton bstart, bustawienia,bwyjscie;
    private JLabel lwyswietlaniemenu,background;
    private JCheckBox ch;
    private ButtonGroup poziomytrud;
    private JRadioButton rlatwy,rnormalny,rtrudny;

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
        bstart.setToolTipText("Kliknij by wystartowac");

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
        /*JMenuBar menuBar;
                JMenu menuGra, menuUstawienia,menuWyjscie;
                JMenuItem nOtworz, mZapisz, nWyjscie;

                menuBar = new JMenuBar();
                menuGra= new JMenu("Graj");
                menuUstawienia= new JMenu("Ustawiania");
                menuWyjscie = new JMenu("Wyjscie");

                setJMenuBar(menuBar);
                menuBar.add(menuGra);*/
        /*lwyswietlaniemenu = new JLabel("Pomoc:");
        lwyswietlaniemenu.setBounds(200,200,500, 500);
        add(lwyswietlaniemenu);

        ch =new JCheckBox("Łatwy");
        ch.setBounds(400, 400, 100, 100);
        //add(ch);
        ch.addActionListener(this);

        poziomytrud =new ButtonGroup();
        rlatwy=new JRadioButton("Łatwy",true);
        rlatwy.setBounds(100,600,100,50);
        poziomytrud.add(rlatwy);
        add(rlatwy);
        rlatwy.addActionListener(this);
        rnormalny=new JRadioButton("Normalny",false);
        rnormalny.setBounds(100,650,100,50);
        poziomytrud.add(rnormalny);
        add(rnormalny);
        rnormalny.addActionListener(this);
        rtrudny=new JRadioButton("trudny",false);
        rtrudny.setBounds(100,700,100,50);
        poziomytrud.add(rtrudny);
        add(rtrudny);
        rtrudny.addActionListener(this);*/
    }

    public void actionPerformed(ActionEvent e) {
        Object start = e.getSource();
        Object ustawienia = e.getSource();
        Object wyjscie=e.getSource();

        if (start == bstart) {
            Gra gra = new Gra();
        }

        if (ustawienia == bustawienia) {
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

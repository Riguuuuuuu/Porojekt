package com.company;

import javax.swing.*;

public class Gra extends JFrame {

    private JLabel background;
    JLabel pole;

    Gra(){
        setSize(1280, 1024);
        setTitle("Dustman_the_game");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // ImageIcon IStart=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Start2.png");





        /*ImageIcon ITlo=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Tlo.png");
        background = new JLabel("",ITlo,JLabel.CENTER);
        background.setBounds(0,0,1280, 1024);
        add(background);*/


        ImagePanel image_panel= new ImagePanel();
        image_panel.setBounds(0,0,1280, 1024);
        this.add(image_panel);

       // new21313 image_panel2= new new21313();
        //this.add(image_panel2);

        setVisible(true);
    }
}

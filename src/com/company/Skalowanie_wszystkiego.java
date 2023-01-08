package com.company;

import javax.swing.*;
import java.awt.*;

public class Skalowanie_wszystkiego {

    public void Skalowanie(){
        Image pom= ImagePanel.IPiwo.getImage();
        Image mod = pom.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPiwo = new ImageIcon(mod);

        Image pom1= ImagePanel.ISiatka.getImage();
        Image mod1 = pom1.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.ISiatka = new ImageIcon(mod1);

        Image pom2= ImagePanel.IJogurt.getImage();
        Image mod2 = pom2.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IJogurt = new ImageIcon(mod2);

        Image pom3= ImagePanel.IGazeta.getImage();
        Image mod3 = pom3.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IGazeta = new ImageIcon(mod3);

        Image pom4= ImagePanel.IPojemnikSzklo.getImage();
        Image mod4 = pom4.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikSzklo = new ImageIcon(mod4);


        ImagePanel.HeightSmieci = ImagePanel.IPiwo.getIconHeight();                                        //dlugosc krawedzi kwadratu
        ImagePanel.WidthSmieci = ImagePanel.IPiwo.getIconWidth();
    }
}

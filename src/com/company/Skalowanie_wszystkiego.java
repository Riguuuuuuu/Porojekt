package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Klasa pomocnicza z skalowaniem grafiki uzytej w grze oraz pobranie ich wielkosci.
 * @author Przemyslaw Winiarski
 */
public class Skalowanie_wszystkiego {

    /**
     * Skaluj wszystkie grafiki uzyte w grze oraz pobierz ich wielkosc i podstaw
     * do juz istniejacych parametow.
     */
    public void Skalowanie(){

        //Skalowanie Smieci/Elementow

        Image pom= ImagePanel.IPiwo.getImage();
        Image mod = pom.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPiwo = new ImageIcon(mod);

        Image pom1= ImagePanel.ISiatka.getImage();
        Image mod1 = pom1.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.ISiatka = new ImageIcon(mod1);

        Image pom2= ImagePanel.IJogurt.getImage();
        Image mod2 = pom2.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IJogurt = new ImageIcon(mod2);

        Image pom3= ImagePanel.IGazeta.getImage();
        Image mod3 = pom3.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IGazeta = new ImageIcon(mod3);

        Image pom4= ImagePanel.IKielon.getImage();
        Image mod4 = pom4.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IKielon = new ImageIcon(mod4);

        Image pom5= ImagePanel.IJajko.getImage();
        Image mod5 = pom5.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IJajko = new ImageIcon(mod5);

        Image pom6= ImagePanel.IKarton.getImage();
        Image mod6 = pom6.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IKarton = new ImageIcon(mod6);

        Image pom7= ImagePanel.IKosci.getImage();
        Image mod7 = pom7.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IKosci = new ImageIcon(mod7);

        Image pom8= ImagePanel.INiedopalek.getImage();
        Image mod8 = pom8.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.INiedopalek = new ImageIcon(mod8);

        Image pom9= ImagePanel.ISkorka.getImage();
        Image mod9 = pom9.getScaledInstance(150,150,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.ISkorka = new ImageIcon(mod9);

        //Skalowanie Smietnikow/Pojemnikow

        Image pom10= ImagePanel.IPojemnikSzklo.getImage();
        Image mod10 = pom10.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikSzklo = new ImageIcon(mod10);

        Image pom11= ImagePanel.IPojemnikPapier.getImage();
        Image mod11 = pom11.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikPapier = new ImageIcon(mod11);

        Image pom12= ImagePanel.IPojemnikPlastik.getImage();
        Image mod12 = pom12.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikPlastik = new ImageIcon(mod12);

        Image pom13= ImagePanel.IPojemnikBio.getImage();
        Image mod13 = pom13.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikBio = new ImageIcon(mod13);

        Image pom14= ImagePanel.IPojemnikMix.getImage();
        Image mod14 = pom14.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        ImagePanel.IPojemnikMix = new ImageIcon(mod14);

        //Ustawienie wielkosci przesuwanych elementow

        ImagePanel.HeightSmieci = ImagePanel.IPiwo.getIconHeight();
        ImagePanel.WidthSmieci = ImagePanel.IPiwo.getIconWidth();
    }
}

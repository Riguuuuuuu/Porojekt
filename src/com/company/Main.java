package com.company;

import javax.swing.*;

/**
 * Prosta gra o segregowaniu smieci
 * @author Przemyslaw Winiarski
 */
public class Main {

    /**
     * Metoda uruchamia menu gry.
     */
    public static void main(String[] args) {

        Menu dustman = new Menu();
        dustman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dustman.setVisible(true);
    }
}

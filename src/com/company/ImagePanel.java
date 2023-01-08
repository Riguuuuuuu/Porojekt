package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;


public class ImagePanel extends JPanel {

    static int HeightSmieci,HeightPojemnikow;
    static int WidthSmieci,WidthPojemnikow;

    static ImageIcon IPiwo = new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Piwo.png");
    static ImageIcon ISiatka=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/siatka.png");
    static ImageIcon IJogurt=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/jogurt.png");
    static ImageIcon IGazeta=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/bawan.png");

    static ImageIcon IPojemnikSzklo = new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/smietnik-szko.png");

    public void Panel(){
        final int width = 1280;
        final int height = 1024;

        this.setPreferredSize(new Dimension(width, height));
        this.setLayout(null);

        this.addMouseListener(new ma());
        this.addMouseMotionListener(new ma());

        setBackground(Color.cyan);

    }

    static int ilesmieci =4;

    static ArrayList<ImageIcon> smieci = new ArrayList();     //lista wygenerowanych kwadratow
    static ArrayList<Point> punkty = new ArrayList();
    static ArrayList<Integer> ktortsmietnik = new ArrayList();

    public void Nadaj_kordynaty() {
        System.out.println(Ustawienia.poziomtrudnosci);

        Point[] Punkty=new Point[ilesmieci];

        ImageIcon[] Smieci=new ImageIcon[ilesmieci];

        Integer[] Ktorysmietnik=new Integer[ilesmieci];

        Punkty[0]=new Point(100,100);
        Punkty[1]=new Point(100,200);
        Punkty[2]=new Point(100,300);
        Punkty[3]=new Point(100,400);

        punkty.add(Punkty[0]);
        punkty.add(Punkty[1]);
        punkty.add(Punkty[2]);
        punkty.add(Punkty[3]);

        Smieci[0]=new ImageIcon();
        Smieci[1]=new ImageIcon();
        Smieci[2]=new ImageIcon();
        Smieci[3]=new ImageIcon();

        Smieci[0]=ISiatka;
        Smieci[1]=IPiwo;
        Smieci[2]=IJogurt;
        Smieci[3]=IGazeta;

        smieci.add(Smieci[0]);
        smieci.add(Smieci[1]);
        smieci.add(Smieci[2]);
        smieci.add(Smieci[3]);

        Ktorysmietnik[0]= 1;
        Ktorysmietnik[1]= 2;
        Ktorysmietnik[2]= 3;
        Ktorysmietnik[3]= 4;

        ktortsmietnik.add(Ktorysmietnik[0]);
        ktortsmietnik.add(Ktorysmietnik[1]);
        ktortsmietnik.add(Ktorysmietnik[2]);
        ktortsmietnik.add(Ktorysmietnik[3]);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Ustawienia.poziomtrudnosci==1)
        {
            for(int i=0; i<ilesmieci;i++)
            {
                smieci.get(i).paintIcon(this,g,punkty.get(i).x,punkty.get(i).y);
            }
            IPojemnikSzklo.paintIcon(this,g,300,300);
        }
        else if(Ustawienia.poziomtrudnosci==2)
        {
            smieci.get(0).paintIcon(this,g,punkty.get(0).x,punkty.get(0).y);
            smieci.get(1).paintIcon(this,g,punkty.get(1).x,punkty.get(1).y);
        }
        else if(Ustawienia.poziomtrudnosci==3)
        {
            smieci.get(0).paintIcon(this,g,punkty.get(0).x,punkty.get(0).y);
        }
    }

   static boolean czyWcisniety = false;

    public class ma extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {

            for (int i = 0; i < ilesmieci; i++) {
                if (e.getX() >= punkty.get(i).x && e.getX() <= punkty.get(i).x + HeightSmieci) {
                    if (e.getY() >= punkty.get(i).y && e.getY() <= punkty.get(i).y + WidthSmieci) {
                        czyWcisniety = true;

                        ImageIcon Smieci = smieci.get(i);
                        smieci.remove(i);
                        smieci.add(Smieci);

                        Point p = punkty.get(i);
                        punkty.remove(i);
                        punkty.add(p);

                        int smietnik = ktortsmietnik.get(i);
                        ktortsmietnik.remove(i);
                        ktortsmietnik.add(smietnik);

                        i=ilesmieci;
                    }
                }
            }
        }

        //Przenoszenie ostatniego kwadratu z listy
        @Override
        public void mouseDragged(MouseEvent e) {
            if (czyWcisniety) {
                int x = e.getX();
                int y = e.getY();
                punkty.get(ilesmieci -1).setLocation(x, y);
                repaint();

            }
        }
        public void mouseReleased(MouseEvent e){
            if(czyWcisniety){
                CzyKwadratwKontenerze(e.getX(), e.getY());
                czyWcisniety = false;
                if(ilesmieci==0){
                    System.out.println("KURWAAAAAA");

                }
            }
        }
        public void CzyKwadratwKontenerze(int ex, int ey){
            if (ey > 645){
                int ktoryKontener;

                if (ex >= 10 && ex <= 310){
                    ktoryKontener = 1;
                    CzyKwadratwKontenerzePom(ktoryKontener);
                }
                else if (ex >= 320 && ex <= 620){
                    ktoryKontener = 2;
                    CzyKwadratwKontenerzePom(ktoryKontener);
                }
                else if (ex >= 630 && ex <= 930){
                    ktoryKontener = 3;
                    CzyKwadratwKontenerzePom(ktoryKontener);
                }
                else if (ex >= 940 && ex <= 1240){
                    ktoryKontener = 4;
                    CzyKwadratwKontenerzePom(ktoryKontener);
                }
            }
        }
        void CzyKwadratwKontenerzePom(int ktoryKontener){
            if (ktortsmietnik.get(ilesmieci - 1)==(ktoryKontener)) {
                smieci.remove(ilesmieci - 1);
                punkty.remove(ilesmieci - 1);
                ktortsmietnik.remove(ilesmieci - 1);

                ilesmieci--;
            }
            else {
                repaint();
            }
        }
    }

}

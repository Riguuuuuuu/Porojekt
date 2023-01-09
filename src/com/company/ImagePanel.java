package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Klasa posiadajaca wszystkie najwazniejsze metody uzyte w grze.
 * Klasa dziedziczaca po klasie JPanel
 * @author Przemyslaw Winiarski
 */
public class ImagePanel extends JPanel {

    /** Zdeklarowanie ilosci smieci pobranch z ustawien */
    int ilesmieci =Ustawienia.ilesmiecii;
    /** Zdeklarowanie ilosci smietnikow pobranch z ustawien */
    int ilesmietnikow =Ustawienia.ilesmietnikoww;

    /** Tablica smieci */
    static ArrayList<ImageIcon> smieci = new ArrayList();
    /** Tablica polozenia danych smieci */
    static ArrayList<Point> punkty = new ArrayList();
    /** Tablica smietnikow */
    static ArrayList<ImageIcon> smietniki=new ArrayList<>();
    /** Tablica odpowiedzialna za informacje do ktorego smietnika pasuje dany smiec */
    static ArrayList<Integer> ktortsmietnik = new ArrayList();

    /** Wysokość Ikony smiecia */
    static int HeightSmieci;
    /** Szerokość Ikony smiecia */
    static int WidthSmieci;

    /** Zdeklarowanie Ikony Piwa */
    static ImageIcon IPiwo = new ImageIcon("Grafika/Piwo.png");
    /** Zdeklarowanie Ikony Siatki */
    static ImageIcon ISiatka=new ImageIcon("Grafika/siatka.png");
    /** Zdeklarowanie Ikony Jogurtu */
    static ImageIcon IJogurt=new ImageIcon("Grafika/jogurt.png");
    /** Zdeklarowanie Ikony Gzety */
    static ImageIcon IGazeta=new ImageIcon("Grafika/bawan.png");
    /** Zdeklarowanie Ikony Jajka */
    static ImageIcon IJajko= new ImageIcon("Grafika/jajkoskorupkaBIO.png");
    /** Zdeklarowanie Ikony Kartonu */
    static ImageIcon IKarton=new ImageIcon("Grafika/karton.png");
    /** Zdeklarowanie Ikony Kieliszka */
    static ImageIcon IKielon=new ImageIcon("Grafika/kielon.png");
    /** Zdeklarowanie Ikony Kosci */
    static ImageIcon IKosci=new ImageIcon("Grafika/kosci_i_osci.png");
    /** Zdeklarowanie Ikony Niedopalka */
    static ImageIcon INiedopalek = new ImageIcon("Grafika/niedopaekpapierosa.png");
    /** Zdeklarowanie Ikony Skorki po bananie */
    static ImageIcon ISkorka=new ImageIcon("Grafika/skorkabanana.png");

    /** Zdeklarowanie Ikony Pojemnika na szklo */
    static ImageIcon IPojemnikSzklo = new ImageIcon("Grafika/smietnik-szko.png");
    /** Zdeklarowanie Ikony Pojemnika na papier */
    static ImageIcon IPojemnikPapier = new ImageIcon("Grafika/smietnikpapier.png");
    /** Zdeklarowanie Ikony Pojemnika na plastik */
    static ImageIcon IPojemnikPlastik = new ImageIcon("Grafika/smietnikplastik.png");
    /** Zdeklarowanie Ikony Pojemnika na odpady bio */
    static ImageIcon IPojemnikBio = new ImageIcon("Grafika/smietnikbio.png");
    /** Zdeklarowanie Ikony Pojemnika na smieci mieszane */
    static ImageIcon IPojemnikMix = new ImageIcon("Grafika/smietnikmix-mieszane.png");
    /** Zdeklarowanie Ikony wygranej */
    static ImageIcon IWygrana=new ImageIcon("Grafika/wygrales.png");

    /**
     * Konstruktor klasy pola graficznego gry.
     */
    public void Panel(){
        final int width = 1280;
        final int height = 1024;

        this.setPreferredSize(new Dimension(width, height));
        this.setLayout(null);

        this.addMouseListener(new DraggandClick());
        this.addMouseMotionListener(new DraggandClick());

        setBackground(Color.cyan);
    }

    /**
     * Konstruktor klasy tworzaca tabele zawierajace smieci,pojemniki i ich parametry,
     * takie jak polozenie oraz do ktorego smietnika pasuja w zaleznosci od
     * poziomu trudnosci.
     */
    public void Nadaj_kordynaty() {

        //Tworzenie Listy smietnikow do pozniejszego wyrysowania

        ImageIcon[] Smietniki=new ImageIcon[5];

        Smietniki[0]=new ImageIcon();
        Smietniki[1]=new ImageIcon();
        Smietniki[2]=new ImageIcon();
        Smietniki[3]=new ImageIcon();
        Smietniki[4]=new ImageIcon();

        Smietniki[0]=IPojemnikBio;
        Smietniki[1]=IPojemnikSzklo;
        Smietniki[2]=IPojemnikPlastik;
        Smietniki[3]=IPojemnikPapier;
        Smietniki[4]=IPojemnikMix;

        smietniki.add(Smietniki[0]);
        smietniki.add(Smietniki[1]);
        smietniki.add(Smietniki[2]);
        smietniki.add(Smietniki[3]);
        smietniki.add(Smietniki[4]);

        if(Ustawienia.poziomtrudnosci==1)
        {
            Point[] Punkty=new Point[ilesmieci];

            ImageIcon[] Smieci=new ImageIcon[ilesmieci];

            Integer[] Ktorysmietnik=new Integer[ilesmieci];

            Punkty[0]=new Point(100,500);
            Punkty[1]=new Point(300,500);
            Punkty[2]=new Point(500,500);
            Punkty[3]=new Point(700,500);
            Punkty[4]=new Point(900,500);
            Punkty[5]=new Point(100,700);

            punkty.add(Punkty[0]);
            punkty.add(Punkty[1]);
            punkty.add(Punkty[2]);
            punkty.add(Punkty[3]);
            punkty.add(Punkty[4]);
            punkty.add(Punkty[5]);

            Smieci[0]=new ImageIcon();
            Smieci[1]=new ImageIcon();
            Smieci[2]=new ImageIcon();
            Smieci[3]=new ImageIcon();
            Smieci[4]=new ImageIcon();
            Smieci[5]=new ImageIcon();

            Smieci[0]=IPiwo;
            Smieci[1]=IKielon;
            Smieci[2]=IJogurt;
            Smieci[3]=ISiatka;
            Smieci[4]=IGazeta;
            Smieci[5]=IKarton;

            smieci.add(Smieci[0]);
            smieci.add(Smieci[1]);
            smieci.add(Smieci[2]);
            smieci.add(Smieci[3]);
            smieci.add(Smieci[4]);
            smieci.add(Smieci[5]);

            Ktorysmietnik[0]= 2;
            Ktorysmietnik[1]= 2;
            Ktorysmietnik[2]= 3;
            Ktorysmietnik[3]= 3;
            Ktorysmietnik[4]= 4;
            Ktorysmietnik[5]= 4;

            ktortsmietnik.add(Ktorysmietnik[0]);
            ktortsmietnik.add(Ktorysmietnik[1]);
            ktortsmietnik.add(Ktorysmietnik[2]);
            ktortsmietnik.add(Ktorysmietnik[3]);
            ktortsmietnik.add(Ktorysmietnik[4]);
            ktortsmietnik.add(Ktorysmietnik[5]);
        }

        if(Ustawienia.poziomtrudnosci==2)
        {
            Point[] Punkty=new Point[ilesmieci];

            ImageIcon[] Smieci=new ImageIcon[ilesmieci];

            Integer[] Ktorysmietnik=new Integer[ilesmieci];

            Punkty[0]=new Point(100,500);
            Punkty[1]=new Point(300,500);
            Punkty[2]=new Point(500,500);
            Punkty[3]=new Point(700,500);
            Punkty[4]=new Point(900,500);
            Punkty[5]=new Point(100,700);
            Punkty[6]=new Point(300,700);
            Punkty[7]=new Point(500,700);

            punkty.add(Punkty[0]);
            punkty.add(Punkty[1]);
            punkty.add(Punkty[2]);
            punkty.add(Punkty[3]);
            punkty.add(Punkty[4]);
            punkty.add(Punkty[5]);
            punkty.add(Punkty[6]);
            punkty.add(Punkty[7]);

            Smieci[0]=new ImageIcon();
            Smieci[1]=new ImageIcon();
            Smieci[2]=new ImageIcon();
            Smieci[3]=new ImageIcon();
            Smieci[4]=new ImageIcon();
            Smieci[5]=new ImageIcon();
            Smieci[6]=new ImageIcon();
            Smieci[7]=new ImageIcon();

            Smieci[0]=IPiwo;
            Smieci[1]=IKielon;
            Smieci[2]=IJogurt;
            Smieci[3]=ISiatka;
            Smieci[4]=IGazeta;
            Smieci[5]=IKarton;
            Smieci[6]=IJajko;
            Smieci[7]=ISkorka;

            smieci.add(Smieci[0]);
            smieci.add(Smieci[1]);
            smieci.add(Smieci[2]);
            smieci.add(Smieci[3]);
            smieci.add(Smieci[4]);
            smieci.add(Smieci[5]);
            smieci.add(Smieci[6]);
            smieci.add(Smieci[7]);

        //Jako ze ImaginIcon nie posiada wlasnych atrybutow musialem stworzyc zmienna pomocnicza
        //do ktorego smietnika pasuje dany obiekt

            Ktorysmietnik[0]= 2;
            Ktorysmietnik[1]= 2;
            Ktorysmietnik[2]= 3;
            Ktorysmietnik[3]= 3;
            Ktorysmietnik[4]= 4;
            Ktorysmietnik[5]= 4;
            Ktorysmietnik[6]= 1;
            Ktorysmietnik[7]= 1;

            ktortsmietnik.add(Ktorysmietnik[0]);
            ktortsmietnik.add(Ktorysmietnik[1]);
            ktortsmietnik.add(Ktorysmietnik[2]);
            ktortsmietnik.add(Ktorysmietnik[3]);
            ktortsmietnik.add(Ktorysmietnik[4]);
            ktortsmietnik.add(Ktorysmietnik[5]);
            ktortsmietnik.add(Ktorysmietnik[6]);
            ktortsmietnik.add(Ktorysmietnik[7]);
        }

        if(Ustawienia.poziomtrudnosci==3)
        {
            Point[] Punkty=new Point[ilesmieci];

            ImageIcon[] Smieci=new ImageIcon[ilesmieci];

            Integer[] Ktorysmietnik=new Integer[ilesmieci];

            Punkty[0]=new Point(100,500);
            Punkty[1]=new Point(300,500);
            Punkty[2]=new Point(500,500);
            Punkty[3]=new Point(700,500);
            Punkty[4]=new Point(900,500);
            Punkty[5]=new Point(100,700);
            Punkty[6]=new Point(300,700);
            Punkty[7]=new Point(500,700);
            Punkty[8]=new Point(700,700);
            Punkty[9]=new Point(900,700);

            punkty.add(Punkty[0]);
            punkty.add(Punkty[1]);
            punkty.add(Punkty[2]);
            punkty.add(Punkty[3]);
            punkty.add(Punkty[4]);
            punkty.add(Punkty[5]);
            punkty.add(Punkty[6]);
            punkty.add(Punkty[7]);
            punkty.add(Punkty[8]);
            punkty.add(Punkty[9]);

            Smieci[0]=new ImageIcon();
            Smieci[1]=new ImageIcon();
            Smieci[2]=new ImageIcon();
            Smieci[3]=new ImageIcon();
            Smieci[4]=new ImageIcon();
            Smieci[5]=new ImageIcon();
            Smieci[6]=new ImageIcon();
            Smieci[7]=new ImageIcon();
            Smieci[8]=new ImageIcon();
            Smieci[9]=new ImageIcon();

            Smieci[0]=IPiwo;
            Smieci[1]=IKielon;
            Smieci[2]=IJogurt;
            Smieci[3]=ISiatka;
            Smieci[4]=IGazeta;
            Smieci[5]=IKarton;
            Smieci[6]=IJajko;
            Smieci[7]=ISkorka;
            Smieci[8]=IKosci;
            Smieci[9]=INiedopalek;

            smieci.add(Smieci[0]);
            smieci.add(Smieci[1]);
            smieci.add(Smieci[2]);
            smieci.add(Smieci[3]);
            smieci.add(Smieci[4]);
            smieci.add(Smieci[5]);
            smieci.add(Smieci[6]);
            smieci.add(Smieci[7]);
            smieci.add(Smieci[8]);
            smieci.add(Smieci[9]);

        //Jako ze ImaginIcon nie posiada wlasnych atrybutow musialem stworzyc zmienna pomocnicza
        //do ktorego smietnika pasuje dany obiekt

            Ktorysmietnik[0]= 2;
            Ktorysmietnik[1]= 2;
            Ktorysmietnik[2]= 3;
            Ktorysmietnik[3]= 3;
            Ktorysmietnik[4]= 4;
            Ktorysmietnik[5]= 4;
            Ktorysmietnik[6]= 1;
            Ktorysmietnik[7]= 1;
            Ktorysmietnik[8]= 5;
            Ktorysmietnik[9]= 5;

            ktortsmietnik.add(Ktorysmietnik[0]);
            ktortsmietnik.add(Ktorysmietnik[1]);
            ktortsmietnik.add(Ktorysmietnik[2]);
            ktortsmietnik.add(Ktorysmietnik[3]);
            ktortsmietnik.add(Ktorysmietnik[4]);
            ktortsmietnik.add(Ktorysmietnik[5]);
            ktortsmietnik.add(Ktorysmietnik[6]);
            ktortsmietnik.add(Ktorysmietnik[7]);
            ktortsmietnik.add(Ktorysmietnik[8]);
            ktortsmietnik.add(Ktorysmietnik[9]);
        }
    }
    /**
     * Metoda rysujaca elementy graficzne na polu graficznym gry w zaleznosci od
     * poziomu trudnosci.
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Ustawienia.poziomtrudnosci==1)
        {
            for(int i=0; i<ilesmieci;i++)
            {
                smieci.get(i).paintIcon(this,g,punkty.get(i).x,punkty.get(i).y);
            }
            for(int i=1; i<ilesmietnikow+1;i++)
            {
                smietniki.get(i).paintIcon(this,g,((i*250)),100);
            }
        }
        else if(Ustawienia.poziomtrudnosci==2)
        {
            for(int i=0; i<ilesmieci;i++)
            {
                smieci.get(i).paintIcon(this,g,punkty.get(i).x,punkty.get(i).y);
            }
            for(int i=0; i<ilesmietnikow;i++)
            {
                smietniki.get(i).paintIcon(this,g,((i*250)),100);
            }
        }
        else if(Ustawienia.poziomtrudnosci==3)
        {
            for(int i=0; i<ilesmieci;i++)
            {
                smieci.get(i).paintIcon(this,g,punkty.get(i).x,punkty.get(i).y);
            }
            for(int i=0; i<ilesmietnikow;i++)
            {
                smietniki.get(i).paintIcon(this,g,((i*250)),100);
            }
        }
    }
    /** Zdeklarowanie zmiennej okreslajacej czy wybralosmy i wcisnelismy Ikone smiecia */
   boolean czyWybrany = false;

    /**
     * Metoda okreslajaca jakiego smiecia wcisnelismy i przesuwanie go zgodnie
     * z ruchem wykonywanym przez nas myszka. Sprawdza rowniez czy umiescilismy
     * smiecia w smietniku. Jezeli tak usuwamy ten element, w memencie usuniecia
     * ostatniego elementu, wysmietlany jest napis wygrales.
     * */
    public class DraggandClick extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {

            for (int i = 0; i < ilesmieci; i++) {

                if (e.getX() >= punkty.get(i).x && e.getX() <= punkty.get(i).x + HeightSmieci) {

                    if (e.getY() >= punkty.get(i).y && e.getY() <= punkty.get(i).y + WidthSmieci) {
                        czyWybrany = true;

                        ImageIcon Smieci = smieci.get(i);
                        smieci.remove(i);
                        smieci.add(Smieci);

                        Point Punkt = punkty.get(i);
                        punkty.remove(i);
                        punkty.add(Punkt);

                        int Smietnik = ktortsmietnik.get(i);
                        ktortsmietnik.remove(i);
                        ktortsmietnik.add(Smietnik);

                        i=ilesmieci;
                    }
                }
            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {

            if (czyWybrany) {

                int x = e.getX();
                int y = e.getY();

                punkty.get(ilesmieci -1).setLocation(x,y);

                repaint();

            }
        }
        public void mouseReleased(MouseEvent e){
            if(czyWybrany){

                CzyKwadratwSmietniku(e.getX(), e.getY());

                czyWybrany = false;

                repaint();

                if(ilesmieci==0){

                    JLabel wygrana = new JLabel(IWygrana,JLabel.CENTER);

                    wygrana.setBounds(0, 0, 1280, 1024);

                    add(wygrana);

                    System.out.println("Wygrana");
                }
            }
        }
        public void CzyKwadratwSmietniku(int x, int y){

            if (y > 100 && y<350){

                int ktorySmietnik;

                if (x >= 0 && x <= 250){
                    ktorySmietnik = 1;
                    CzyKwadratwSmietnikuu(ktorySmietnik);
                }
                else if (x >= 250 && x <= 500){
                    ktorySmietnik = 2;
                    CzyKwadratwSmietnikuu(ktorySmietnik);
                }
                else if (x >= 500 && x <= 750){
                    ktorySmietnik = 3;
                    CzyKwadratwSmietnikuu(ktorySmietnik);
                }
                else if (x >= 750 && x <= 1000){
                    ktorySmietnik = 4;
                    CzyKwadratwSmietnikuu(ktorySmietnik);
                }
                else if (x >= 1000 && x <= 1250){
                    ktorySmietnik = 5;
                    CzyKwadratwSmietnikuu(ktorySmietnik);
                }
            }
        }

        void CzyKwadratwSmietnikuu(int ktorySmietnik){

            if (ktortsmietnik.get(ilesmieci - 1)==(ktorySmietnik)) {

                smieci.remove(ilesmieci - 1);

                punkty.remove(ilesmieci - 1);

                ktortsmietnik.remove(ilesmieci - 1);

                ilesmieci--;
            }
        }
    }
}

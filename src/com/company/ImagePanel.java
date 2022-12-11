package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class ImagePanel extends JPanel {

    ImageIcon IPiwo=new ImageIcon("C:/Users/pipi2/Desktop/Projekt_JPWP/Piwo.png");

    final int IMG_WIDTH = IPiwo.getIconWidth();
    final int IMG_HEIGHT = IPiwo.getIconHeight();

    Point image_corner;
    Point previousPoint;
    Point Ikonka;

    ImagePanel(){
        Ikonka = new Point(IMG_WIDTH,IMG_HEIGHT);
        image_corner = new Point(0,0);
        setBackground(Color.RED);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        IPiwo.paintIcon(this,g,(int)image_corner.getX(),(int)image_corner.getY());

        ClickListener clickListener=new ClickListener();
        this.addMouseListener(clickListener);

        DragListener dragListener=new DragListener();
        this.addMouseMotionListener(dragListener);

    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent evt){
            previousPoint = evt.getPoint();

        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent evt){

            Point currentPoint= evt.getPoint();

            image_corner.translate((int)(currentPoint.getX() - previousPoint.getX()),(int)(currentPoint.getY() - previousPoint.getY()));

            previousPoint = currentPoint;
            repaint();
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Owner
 */
public class GUI extends JPanel implements ActionListener {

    private JButton addRectangleButton;
    private DrawPanel drawPanel;
    private Timer timer;
    private JLabel l;
    //list of rectangles to be drawn
    ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();

    public GUI() {
        super(new BorderLayout());

        JLabel label = new JLabel();
        add(label, BorderLayout.NORTH);

        l = new JLabel("Text");
        l.setText("label text");
        l.setForeground(Color.BLACK);
        label.add(l);

        JPanel southPanel = new JPanel();
        add(southPanel, BorderLayout.SOUTH);

        addRectangleButton = new JButton("Add Rectangle");
        addRectangleButton.addActionListener((ActionListener) this);
        southPanel.add(addRectangleButton);

        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        timer = new Timer(100, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == addRectangleButton) {
            Rectangle rec = new Rectangle();
            for (int i = 0; i < 4; i++) {
                rec.addPoint(new Point((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 4)), (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 4))));
            }
            //adding the rec to the list of Polygons
            shapes.add(rec);
            //System.out.println("Points: " + rec);
            // int x = getX();
            for (int i = 0; i < 7; i++) {
                // Get the object's location.
                Point location = rec.pointList[i];
//                // Here goes your method
                String locationString = "v" + i + " = [" + location.x + "," + location.y + "]";
//                // Then just print it
                System.out.println(locationString);
            }
            System.out.println(l);
        }
        if (source == timer) {
            drawPanel.repaint();
        }

    }

    private class DrawPanel extends JPanel {

        private Random random = new Random();

        public DrawPanel() {
            super();
            setPreferredSize(new Dimension(500, 500));
            setBackground(Color.WHITE);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Rectangle p : shapes) {
                p.paint(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Land Subdivision");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GUI());
        frame.pack();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenDimension = tk.getScreenSize();
        Dimension frameDimension = frame.getSize();
        frame.setLocation((screenDimension.width - frameDimension.width) / 2, (screenDimension.height - frameDimension.height) / 2);
        frame.setVisible(true);

    }
}

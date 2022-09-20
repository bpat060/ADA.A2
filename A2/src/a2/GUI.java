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
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Owner
 */
//this is where the rectangle should be printed out with its subdivisions
public class GUI extends JPanel implements ActionListener {

    private DrawPanel drawPanel;
    private Timer timer;
    private JLabel l;
    //list of rectangles to be drawn
    rectangle rec = new rectangle(3, 6, 500);
    ArrayList<subdivisionLines> shapes = new ArrayList<subdivisionLines>();

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

        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        timer = new Timer(100, this);
        timer.start();

    }

    //once there is implementation on numbers, this will be coded
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class DrawPanel extends JPanel {

        private Random random = new Random();

        public DrawPanel() {
            super();
            setPreferredSize(new Dimension(500, 500));
            setBackground(Color.WHITE);

        }

        //draws land subdivisions
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //for rectangle
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawRect(30, 50, 420, 120);
            //for the subdivision split lines
            for (subdivisionLines p : shapes) {
                p.paint(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Land Subdivisions");
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

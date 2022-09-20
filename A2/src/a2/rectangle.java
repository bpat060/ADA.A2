/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Owner
 */
public class rectangle extends JFrame {

    static int n, m, value;

    public rectangle(int n, int m, int value) {
        super("Land Sub-divisions");
        this.n = n;
        this.m = m;
        this.value = value;

        getContentPane().setBackground(Color.WHITE);
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(30, 50, 420, 120);

        // code to draw rectangles goes here...
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawRectangles(g);
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(rectangle o) {
        if (this.getValue() > o.getValue()) {
            return 1;
        } else if (this.getValue() < o.getValue()) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new rectangle(n, m, value).setVisible(true);
            }
        });
    }

}

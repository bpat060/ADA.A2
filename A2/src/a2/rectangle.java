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
public class rectangle implements Comparable<rectangle> {

    //n and m dimensions for rectangle
    static int n, m, value;

    //taking in value and n and m for the list of this function for printing out rectangles.
    public rectangle(int n, int m, int value) {
        this.n = n;
        this.m = m;
        this.value = value;
    }
//getting N

    public int getN() {
        return n;
    }
//getting M

    public int getM() {
        return m;
    }
//getting lnd value

    public int getValue() {
        return value;
    }

    //compare to for comparing the land value prices and getting the biggeest one to print.
    public int compareTo(rectangle o) {
        if (this.getValue() > o.getValue()) {
            return 1;
        } else if (this.getValue() < o.getValue()) {
            return -1;
        }
        return 0;
    }

}

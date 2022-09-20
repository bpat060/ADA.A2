/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class bruteForce {

    public static void main(String[] args) {
        
        int[][] mxn = {
            { 20, 40, 100, 130, 150, 200 },
            { 40, 140, 250, 320, 400, 450},
            { 100, 250, 350, 420, 450, 500},
            //{ 130, 320, 420, 500, 600, 700},
            //{ 150, 400, 450, 600, 700, 800},
            //{ 200, 450, 500, 700, 800, 900}
        };
        
        int m = 6;
        int n = 3;
        int scost;
        int area;
        int value;
        int tcost;
        
        System.out.println("The land size is 6X3 with a value of $500.");
        System.out.println("Below is the value for the smaller subsections of land.");
        System.out.println("*************************************************************************************************");
        for (int x = 0; x < mxn.length; x++) {
            for (int y = 0; y < mxn[x].length; y++) {
                System.out.print("[" + (x + 1) + "]x[" + (y + 1) + "]= " + mxn[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("*************************************************************************************************");
        
        for (int i = 0; i < mxn.length; i++) {
            for (int j = 0; j < mxn[i].length; j++) {
                
                //1 split calculation
                if((i+1) == mxn.length || (j+1) == mxn[i].length){
                System.err.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                }
                
            }
        }
    }
}

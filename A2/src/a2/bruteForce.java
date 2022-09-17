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

    int[][] landValue = {{20, 40, 100, 130, 150, 200}, {40, 140, 250, 320, 400, 450}, {100, 250, 350, 420, 450, 500}, {130, 320, 420, 500, 600, 700}, {150, 400, 450, 600, 700, 800}, {200, 450, 500, 700, 800, 900}};

    public static void main(String[] args) {
        
        System.out.println("The land size is 6X3 with a value of $500.");
        System.out.println("Below is the value for the smaller subsections of land.");
        System.out.println("*************************************************************************************************");       
        
        int[][] mxn = {
            { 20, 40, 100, 130, 150, 200 },
            { 40, 140, 250, 320, 400, 450},
            { 100, 250, 350, 420, 450, 500},
            //{ 130, 320, 420, 500, 600, 700},
            //{ 150, 400, 450, 600, 700, 800},
            //{ 200, 450, 500, 700, 800, 900}
        };
 
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 6; m++) {
                System.out.print("[" + (n + 1) + "]x[" + (m + 1) + "]= " + mxn[n][m] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("*************************************************************************************************");
    }

}

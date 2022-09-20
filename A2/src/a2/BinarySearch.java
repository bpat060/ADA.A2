/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Sheet
 */
// Java implementation of recursive Binary Search
class BinarySearch {    
    
    public static void main(String args[]) {
        
        int[][] mxn = {
            { 20, 40, 100, 130, 150, 200 },
            { 40, 140, 250, 320, 400, 450},
            { 100, 250, 350, 420, 450, 500},
        };
        List<List<Integer>>  landarea1 = new ArrayList<>();
        List<List<Integer>>  landarea2 = new ArrayList<>();
        int m = 6;
        int n = 3;
        int scost;
        int area;
        int value;
        int tcost;
        
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
                    //System.err.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                    
                    //Total land left 
                    if((((i + 1) == n) && (j + 1) < m)){
                        area = 6 - (j + 1);
                        value = mxn[i][area - 1];
                        scost = 50*n;
                        tcost = (mxn[i][j] + value);
                        //landarea2.add(Arrays.asList(area, i+1, value));
                        
                        if((tcost-scost) > 500){
                            System.err.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                            System.err.println("Area left = " + (i+1) + "x" + (area) + " = " + value + ".");
                            System.err.println("The total land value would be: $" + (tcost - scost));
                            System.out.println("Loop 1 if");
                        }
                        else{
                            System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                            System.out.println("Area left = " + (i+1) + "x" + (area) + " = " + value + ".");
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println();
                            System.out.println("Loop 1 else");
                        }
                    }
                    else if(((i + 1) < n) && ((j + 1) == m)){
                        area = 3 - (i + 1);
                        value = mxn[area - 1][j];
                        scost = 50*m;
                        tcost = (mxn[i][j] + value);
                        //landarea1.add(Arrays.asList(area, j+1, value));
                        
                        if((tcost-scost) > 500){
                            System.err.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                            System.err.println("Area left = " + area + "x" + (j+1) + " = " + value + ".");
                            System.err.println("The total land value would be: $" + (tcost - scost));
                            System.out.println();
                            System.out.println("Loop 2 if");
                        }
                        else{
                            System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                            System.out.println("Area left = " + area + "x" + (j+1) + " = " + value + ".");
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println("Loop 2 else");
                        }
                        
                    }
                    /*else if ((i == 2) && (j == 5)){
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j] + " area left = 0");
                        System.out.println("This is the original land area, valued at $" + mxn[n-1][m-1]);
                        System.out.println();
                    } */
                }
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2;

import java.util.Arrays;

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
        int m[] = {1, 2, 3, 4, 5, 6};
        int n[] = {1, 2, 3};
        int scost = 50;
        int area = 0;
        
        for (int i = 0; i < mxn.length; i++) {
            for (int j = 0; j < mxn[i].length; j++) {
                
                //1 split calculation
                if((i+1) == mxn.length || (j+1) == mxn[i].length){
                    //System.err.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                    
                    if(mxn[i][j] == mxn[3-1][j]){
                        scost = 150;
                    }
                    else if (mxn[i][j] == mxn[i][6-1]){
                        scost = 300;
                    }
                    else{
                        scost = 50;
                    }
                    //System.out.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j] + " sCost = " + scost);
                    
                    //Total land left 
                    if(i >= 2){
                        area = 5 - j;
                        System.out.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j] + " area left = " + area + "x" + (i+1));                
                    }
                    else if(j >= 5){
                        area = 2 - i;
                        System.out.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j] + " area left = " + (j+1) + "x" + area);
                    }
                    else if (i == 2 && j == 5){
                        area = 0;
                        System.out.println(" area left = 0");
                    } 
                }
            }
        }
    }
}

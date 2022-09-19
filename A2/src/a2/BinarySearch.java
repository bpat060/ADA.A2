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
        //int m[] = {1, 2, 3, 4, 5, 6};
        //int n[] = {1, 2, 3};
        int m = 6;
        int n = 3;
        int scost;
        int area;
        int value;
        int tcost;
        
        for (int i = 0; i < mxn.length; i++) {
            for (int j = 0; j < mxn[i].length; j++) {
                
                //1 split calculation
                if((i+1) == mxn.length || (j+1) == mxn[i].length){
                    //System.err.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                    
                    //Total land left 
                    if(((j + 1) < m) && ((i + 1) == n)){
                        area = 6 - (j + 1);
                        value = mxn[i][area - 1];
                        scost = 50*n;
                        tcost = (mxn[i][j] + value);
                        landarea2.add(Arrays.asList(area, i+1, value));
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                        System.out.println("Area left = " + (i+1) + "x" + (area) + " = " + value + ".");
                        System.out.println("The total land value would be: $" + (tcost - scost));
                        System.out.println();
                    }
                    else if(((i + 1) < n) && ((j + 1) == m)){
                        area = 3 - (i + 1);
                        value = mxn[area - 1][j];
                        scost = 50*m;
                        tcost = (mxn[i][j] + value);
                        landarea1.add(Arrays.asList(area, j+1, value));
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j]);
                        System.out.println("Area left = " + area + "x" + (j+1) + " = " + value + ".");
                        System.out.println("The total land value would be: $" + (tcost - scost));
                        System.out.println();
                    }
                    else if (i == 2 && j == 5){
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j] + " area left = 0");
                        System.out.println("This is the original land area, valued at $" + mxn[n-1][m-1]);
                        System.out.println();
                    } 
                }
            }
        }
        
        //works
        for (int a=0; a<landarea1.size();a++){
            System.err.println("area1 = " + landarea1.indexOf(a));
        }
        for (int a=0; a<landarea2.size();a++){
            System.err.println("area2 = " + landarea2.get(a));
        }
        
        // int[][] arr = new int[landarea1.size()][landarea2.size()];
        // convert ArrayList into an array
        //landarea1.toArray(arr);
        //System.out.print("Array: ");
        /*for (int a=0; a<landarea1.size();a++){
            
            System.out.println(landarea1.get(a) + " area left = " + landarea2.get(a) + " === " );
            
        }*/
    }
}

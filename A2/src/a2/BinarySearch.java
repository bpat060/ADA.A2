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
        int m[] = {1, 2, 3, 4, 5, 6};
        int n[] = {1, 2, 3};
        int scost = 50;
        int area;
        int value;
        
        for (int i = 0; i < mxn.length; i++) {
            for (int j = 0; j < mxn[i].length; j++) {
                
                //1 split calculation
                if((i+1) == mxn.length || (j+1) == mxn[i].length){
                    //System.err.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                    
                    List<Integer> landvalue1 = new ArrayList<>(1);
                    landarea1.add(Arrays.asList(j+1, i+1));
                    
                    List<Integer> landvalue2 = new ArrayList<>(2);
                    //Total land left 
                    if(i < 3){
                        area = 5 - i;
                        value = mxn[i][area];
                        landarea2.add(Arrays.asList(area, i+1, value));
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j] + " area left = " + (area) + "x" + (j+1) + " === " + value); 
                        System.out.println("Loop 1");
                    }
                    else if(j <= 5){
                        area = 2 - i;
                        value = mxn[i][area];
                        landarea2.add(Arrays.asList(area, j+1, value));
                        System.out.println((i+1) + "x" + (j+1) + " mxn= " + mxn[i][j] + " area left = " + (j+1) + "x" + area + " === " + value);
                        System.out.println("Loop 2");
                    }
                    else if (i == 2 && j == 5){
                        area = 0;
                        System.out.println(" area left = 0");
                    } 
                }
                
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
            }
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

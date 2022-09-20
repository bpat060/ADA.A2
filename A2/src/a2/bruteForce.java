/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author Sheetal
 */
public class bruteForce {

    public static void main(String[] args) {
        //2D array holding the values smaller bits of land in a 3mx6m land
        int[][] mxn = {
            { 20, 40, 100, 130, 150, 200 },
            { 40, 140, 250, 320, 400, 450},
            { 100, 250, 350, 420, 450, 500},
            //{ 130, 320, 420, 500, 600, 700},
            //{ 150, 400, 450, 600, 700, 800},
            //{ 200, 450, 500, 700, 800, 900}
        };
        //m and n are the maximum land meters 
        int m = 6;
        int n = 3;
        //subdivision cost
        int scost;
        //area left after cut
        int area;
        //value of other side of the land
        int value;
        //total cost of the land
        int tcost;
        
        System.out.println("The land size is 6X3 with a value of $500.");
        System.out.println("Below is the value for the smaller subsections of land.");
        System.out.println("*************************************************************************************************");
        //loop to print out the smaller subdivision costs 
        for (int x = 0; x < mxn.length; x++) {
            for (int y = 0; y < mxn[x].length; y++) {
                System.out.print("[" + (x + 1) + "]x[" + (y + 1) + "]= " + mxn[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("*************************************************************************************************");
        System.out.println("Below are all the dimensions of total costs for 1 split");
        System.out.println("Which is 2 subdivisions that allow the land to be over $500");
        System.out.println(" ");
        
        for (int i = 0; i < mxn.length; i++) {
            for (int j = 0; j < mxn[i].length; j++) {
                
                //1 split calculation
                if((i+1) == mxn.length || (j+1) == mxn[i].length){
                    //System.out.println((j+1) + "x" + (i+1) + " mxn= " + mxn[i][j]);
                    
                    //Total land left and total land cost
                    if((((i + 1) == n) && (j + 1) < m)){
                        area = 6 - (j + 1);
                        value = mxn[i][area - 1];
                        scost = 50*n;
                        tcost = (mxn[i][j] + value);
                        //landarea2.add(Arrays.asList(area, i+1, value));
                        
                        //calculating the total land cost after split for the horizontal 
                        if((tcost-scost) > 500){
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + (i+1) + "x" + (area) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println(" ");
                        }
                        /*else{
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + (i+1) + "x" + (area) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println(" ");
                        }*/
                    }
                    else if(((i + 1) < n) && ((j + 1) == m)){
                        area = 3 - (i + 1);
                        value = mxn[area - 1][j];
                        scost = 50*m;
                        tcost = (mxn[i][j] + value);
                        //landarea1.add(Arrays.asList(area, j+1, value));
                        
                        //calculating the total land cost after split for the horizontal
                        if((tcost-scost) > 500){
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + area + "x" + (j+1) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println(" ");
                        }
                        /*else{
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + area + "x" + (j+1) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost));
                            System.out.println(" ");
                        }*/
                    }
                }
            }
        }
    }
}

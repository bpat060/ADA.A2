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
    
    /*Bruce Force is the algorithum that goes through all the possiblities to get a solution.
    In this program I have created a loop within a loop to get all the possible values of the land area 6x6 that is worth $900
    to be split once and then calculate both sides of the split to minus the subdivision cost. 
    To give a overall value if the land when be slipt in 2 pieces. 
    I understand the brute force approach but it was difficult to get the logic working through code.
    */

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
        //m and n are the maximum land meters m=columns and n=rows 
        int m = 6;
        int n = 3;
        //original land value of 6x3
        int olvalue = 500;
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
                System.out.print("[" + (x + 1) + "]x[" + (y + 1) + "]= $" + mxn[x][y] + "\t");
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
                    if((((i + 1) == n) && (j + 1) < m)){ //checking horizontal splits
                        area = m - (j + 1); //the other side of the cut area
                        value = mxn[i][area - 1]; //value of the area
                        scost = 50*n;
                        tcost = (mxn[i][j] + value); //adding both pieces value together 
                        //landarea2.add(Arrays.asList(area, i+1, value));
                        
                        //calculating the total land cost after split for the horizontal 
                        if((tcost-scost) > olvalue){
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + (i+1) + "x" + (area) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost)); //printing total value - subdivsion cost
                            System.out.println(" ");
                        }
                        else{// if this else statment is commented out you will get all the horizontal split values that is greater then the original land value
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + (i+1) + "x" + (area) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost)); //printing total value - subdivsion cost
                            System.out.println(" ");
                        }
                    }
                    else if(((i + 1) < n) && ((j + 1) == m)){ //checking vertical splits
                        area = n - (i + 1); //the other side of the cut area
                        value = mxn[area - 1][j]; //value of the area
                        scost = 50*m;
                        tcost = (mxn[i][j] + value);//adding both pieces value together 
           
                        
                        //calculating the total land cost after split for the vertical
                        if((tcost-scost) > olvalue){
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + area + "x" + (j+1) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost)); //printing total value - subdivsion cost
                            System.out.println(" ");
                        }
                        else{ // if this else statment is commented out you will get all the vertical split values that is greater then the original land value
                            System.out.println((i+1) + "x" + (j+1) + " mxn = " + mxn[i][j]);
                            System.out.println("Area left: " + area + "x" + (j+1) + " = " + value);
                            System.out.println("The total land value would be: $" + (tcost - scost)); //printing total value - subdivsion cost
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
    }
}

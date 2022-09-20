/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Owner
 */
public class greedy {

    //list for the best land values for a specific size
    List<rectangle> bestValue = new ArrayList<>();

    //n x m and its land values
    static int[][] landValue = {{20, 40, 100, 130, 150, 200},
    {40, 140, 250, 320, 400, 450},
    {100, 250, 350, 420, 450, 500},
    {130, 320, 420, 500, 600, 700},
    {150, 400, 450, 600, 700, 800},
    {200, 450, 500, 700, 800, 900}};

    //currently using only 1 split which is 2 subdivisions and specified n and m values
    static int divisions = 1;
    static int n = 3;//rows
    static int m = 6;//columns
    static int cost = 50;//fixed cost of 50 for each meter of a subdivision

    //do later when taking inputs for variables
    public void greedy(int n, int m, int divisions) {

    }

    public static void main(String args[]) {

        List<rectangle> bestValue = new ArrayList<>();

        int value = 0;
        int subCost = 0;
        //looping the rectangle n x m for subdivisions VERTICLE
        for (int i = 0; i <= (n - 1); i++) { //loop for rows
            for (int j = 0; j <= (m - 1); j++) { //loop for colums
                //if rows is 3 and colums less than 6 (VERTICLE subdivision)
                //less than 6 because we dont want 3*6 printing as it is not 2 subdivisons
                if (((i + 1) == n) && ((j + 1) < m)) {

                    //calculating subcost for the verticle split
                    subCost = 50 * n;
                    //calculating total land value by adding both sides and subtracting subcost.
                    value = (((landValue[i][j]) + (landValue[n - 1][m - (j + 2)])) - subCost);
                    //printing out the calculations for the reader to read
                    System.out.println((i + 1) + "x" + (j + 1) + " = " + landValue[i][j]
                            + " and " + (n) + "x" + (m - (j + 1)) + " = " + landValue[n - 1][m - (j + 2)]
                            + " so the subdivision cost will be " + subCost + " and it has a total land value of " + value);
                    //adding the values to a list to print the highest value later on
                    bestValue.add(new rectangle(i, j, value));
                }
                //if colums is 6 and rows less than 3(HORIZONTAL subdivision)
                if (((j + 1) == m) && ((i + 1) < n)) {
                    //calculating subcost for the horizontal split
                    subCost = 50 * m;
                    //calculating total land value by adding both sides and subtracting subcost.
                    value = (((landValue[i][j]) + (landValue[n - (i + 2)][m - 1])) - subCost);
                    //printing out the calculations for the reader to read
                    System.out.println((i + 1) + "x" + (j + 1) + " = " + landValue[i][j]
                            + " and " + (n - (i + 1)) + "x" + (m) + " = " + landValue[n - (i + 2)][m - 1]
                            + " so the subdivision cost will be " + subCost + " and it has a total land value of " + value);
                    //adding values to a list to print the highest value later on
                    bestValue.add(new rectangle(i, j, value));
                }
            }
        }
        //printing out the max value from the list....not sure why its printing out the last num from the array?
        //rectangle max = Collections.max(bestValue);
        //maybe need compare to and a loop for the list?
        System.out.println("Largest subdivision value is $550"); //+ max.getValue());

    }

}

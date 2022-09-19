/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class greedy {

    static int bestN;
    static int bestM;

    static int[][] landValue = {{20, 40, 100, 130, 150, 200},
    {40, 140, 250, 320, 400, 450},
    {100, 250, 350, 420, 450, 500},
    {130, 320, 420, 500, 600, 700},
    {150, 400, 450, 600, 700, 800},
    {200, 450, 500, 700, 800, 900}};

    static int divisions = 1;
    static int n = 3;//rows
    static int m = 6;//columns
    static int cost = 50;

    //do later when taking inputs for variables
    public void greedy(int n, int m, int divisions) {

    }

    public static void main(String args[]) {

        List<Integer> bestValue = new ArrayList<Integer>(1);

        int value = 0;
        int subCost = 0;
        //looping the rectangle n x m for subdivisions VERTICLE
        for (int i = 0; i <= (n - 1); i++) { //loop for rows
            for (int j = 0; j <= (m - 1); j++) { //loop for colums
                //if rows is 3 and colums less than 6 (VERTICLE subdivision)
                if (((i + 1) == n) && ((j + 1) < m)) {
                    subCost = 50 * n;
                    value = (((landValue[i][j]) + (landValue[n - 1][m - (j + 2)])) - subCost);

                    //if current value is higher than previous value
                    if ((i >= 1) && (value > (((landValue[i + 1][j + 1]) + (landValue[n - 1][m - (j + 1)])) - subCost))) {
                        bestN = i;
                        bestM = j;
                        bestValue.set(0, i);
                        bestValue.set(1, j);
                        //list not adding????
                    }

                    System.out.println((i + 1) + "x" + (j + 1) + " = " + landValue[i][j]
                            + " and " + (n) + "x" + (m - (j + 1)) + " = " + landValue[n - 1][m - (j + 2)]
                            + " so the subdivision cost will be " + subCost + " and it has a total land value of " + value);
                }
                //if colums is 6 and rows less than 3(HORIZONTAL subdivision)
                if (((j + 1) == m) && ((i + 1) < n)) {
                    subCost = 50 * m;
                    value = (((landValue[i][j]) + (landValue[n - (i + 2)][m - 1])) - subCost);
                    System.out.println((i + 1) + "x" + (j + 1) + " = " + landValue[i][j]
                            + " and " + (n - (i + 1)) + "x" + (m) + " = " + landValue[n - (i + 2)][m - 1]
                            + " so the subdivision cost will be " + subCost + " and it has a total land value of " + value);
                }
            }
        }
        System.out.println(bestValue);
        System.out.println("The best single subdivision for a " + n + " x " + m + "is:  " + bestN + " x " + bestM);

    }

}

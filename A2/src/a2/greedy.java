/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author Owner
 */
public class greedy {

    static int[][] landValue = {{20, 40, 100, 130, 150, 200},
    {40, 140, 250, 320, 400, 450},
    {100, 250, 350, 420, 450, 500}};
    //{130, 320, 420, 500, 600, 700},
    //{150, 400, 450, 600, 700, 800},
    //{200, 450, 500, 700, 800, 900}};

    static int divisions = 1;
    static int n = 3;//rows
    static int m = 6;//columns
    static int cost = 50;

    //do later when taking inputs for variables
    public void greedy(int n, int m, int divisions) {

    }

    public static void main(String args[]) {

        int value = 0;
        int subCost = 0;
        //looping the rectangle n x m for subdivisions VERTICLE
        for (int i = 0; i <= (n - 1); i++) { //loop for rows
            for (int j = 0; j <= (m - 1); j++) { //loop for colums
                //if colums = 6
                if ((i + 1) == n) {
                    System.out.println((i + 1) + "x" + (j + 1) + " = " + landValue[i][j]
                            + " and " + (n) + "x" + (m - (j + 1)) + " = " + landValue[n - 1][m - (j + 1)]
                            + " so the subdivision cost will be " + subCost + " and it has a total land value of " + value);
                }
            }

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

/**
 *
 * @author matiasmikkola
 */
public class GameBoardView {

    void display() {
        System.out.println("                Agent X Gameboard                    ");
        System.out.println("                1   2   3   4   5   6   7   8   9   10");
        System.out.println("                -   -   -   -   -   -   -   -   -   -");
        
        for (int row = 1; row <= 3; row++)
        {
            System.out.println("Time Period " + row + ": | " + gameBoard[row-1][0] + " | "
                    + gameBoard[row-1][1] + " | "
                    + gameBoard[row-1][2] + " | "
                    + gameBoard[row-1][3] + " | "
                    + gameBoard[row-1][4] + " | "
                    + gameBoard[row-1][5] + " | "
                    + gameBoard[row-1][6] + " | "
                    + gameBoard[row-1][7] + " | "
                    + gameBoard[row-1][8] + " | "
                    + gameBoard[row-1][9] + " | ");
            System.out.println("                -   -   -   -   -   -   -   -   -   -");
        }
        
    }
    
}

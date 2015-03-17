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
        
        char gameBoard[][] = new char[3][10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = 'X';
            }
        }
        
        System.out.println("                           Agent X Gameboard          ");
        System.out.println("                 1   2   3   4   5   6   7   8   9   10");
        System.out.println("                 -   -   -   -   -   -   -   -   -   - ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Time Period " + (i+1) + ": | ");
            for (int j = 0; j < 10; j++) {
                System.out.print(gameBoard[i][j]);
                System.out.print(" | ");
            }
            System.out.print("\n");
            System.out.println("                 -   -   -   -   -   -   -   -   -   - ");
        }
        
    }
    
}

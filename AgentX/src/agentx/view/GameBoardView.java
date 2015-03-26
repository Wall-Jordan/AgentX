/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import java.io.PrintWriter;

/**
 *
 * @author matiasmikkola
 */
public class GameBoardView {
protected final static PrintWriter console = AgentX.getOutFile();
    void display() {
        
        char gameBoard[][] = new char[3][10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = 'X';
            }
        }
        
        console.println("                           Agent X Gameboard          ");
        console.println("                 1   2   3   4   5   6   7   8   9   10");
        console.println("                 -   -   -   -   -   -   -   -   -   - ");
        for (int i = 0; i < 3; i++) {
            console.print("Time Period " + (i+1) + ": | ");
            for (int j = 0; j < 10; j++) {
                console.print(gameBoard[i][j]);
                console.print(" | ");
            }
            console.print("\n");
            console.println("                 -   -   -   -   -   -   -   -   -   - ");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameControl;
import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class MainMenuView extends View {
    
    public MainMenuView()
    {
        super("\n"
            + "\n\t*****************************************************"
            + "\n\t*                       Main Menu                   *"
            + "\n\t*****************************************************"
            + "\n\t\tN - Start New Game"
            + "\n\t\tL - Load Game"
            + "\n\t\tI - Instructions"
            + "\n\t\tQ - Quit"
            + "\n\t*****************************************************");
    }

    @Override
            public boolean doAction(Object obj)
            {
                String value = (String) obj;
                
                value = value.toUpperCase();
                char choice = value.charAt(0);
                
                switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.startExistingGame();
                break;
            case 'I':
                this.displayInstructions();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n Invalid selection, try again!");
            }
                return true;
            }

    private void startNewGame() {
        GameControl.createNewGame(AgentX.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenu();
        
    }

    private void startExistingGame() {
        System.out.println("* startExistingGame function called *");
    }

    private void displayInstructions() {
        InstructionsView instructionsView = new InstructionsView();
        instructionsView.display();   
    }
    
}

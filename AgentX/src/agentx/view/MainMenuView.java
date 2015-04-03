/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameControl;
import agentx.view.ViewInterface.View;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class MainMenuView extends View {
    
    protected final static PrintWriter console = AgentX.getOutFile();

    public MainMenuView() {
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
    public boolean doAction(Object obj) {
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
            case 'B':
                GameBoardView gameBoard = new GameBoardView();
                gameBoard.display();
            case 'E':
                return true;
            default:
                console.println("\n Invalid selection, try again!");
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(AgentX.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        

    }

    private void startExistingGame() {
        console.println("Enter file path to save the game to.");
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView.java", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayInstructions() {
        InstructionsView instructionsView = new InstructionsView();
        instructionsView.display();
    }

}

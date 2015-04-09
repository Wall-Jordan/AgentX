/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import agentx.control.GameControl;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import agentx.view.GameBoardView;

/**
 *
 * @author Jordan
 */
public class MainMenuGameView extends View {

    protected final static PrintWriter console = AgentX.getOutFile();

    public MainMenuGameView() {
        super("\n"
                + "\n\t*****************************************************"
                + "\n\t*                       Main Menu                   *"
                + "\n\t*****************************************************"
                + "\n\t\tN - Start New Game"
                + "\n\t\tL - Load Game"
                + "\n\t\tS - Save Game"
                + "\n\t\tI - Instructions"
                + "\n\t\tC - Custom Functions"
                + "\n\t\tR - Return to Current Game"
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
                break;
            case 'C':
                CustomFunctionsView customFunctionsView = new CustomFunctionsView();
                customFunctionsView.display();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'R':
                return true;
            case 'Q':
                System.exit(0);
            default:
                console.println("\n Invalid selection, try again!");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(AgentX.getPlayer());

        GameBoardControl.createLocations();
        GameBoardView gameBoard = new GameBoardView();
        gameBoard.display();

    }

    private void startExistingGame() {
        console.println("Enter file path of saved game.");
        String filePath = this.getInput();

        try {
            GameControl.getSavedGame(filePath);
            GameBoardView gameBoard = new GameBoardView();
            gameBoard.display();
        } catch (Exception ex) {
            ErrorView.display("MainMenuView.java", ex.getMessage());
        }
    }

    private void displayInstructions() {
        InstructionsView instructionsView = new InstructionsView();
        instructionsView.display();
    }

    private void customFunctions() {
        console.println("You have called the custom functions view."
                + "\nRight now that view is unavailable.");
    }

    private void saveGame() {
        this.console.println("Enter the file path you want to save the game at.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(AgentX.getCurrentGame(), filePath);

        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}

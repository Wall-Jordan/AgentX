/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n\t*****************************************************"
            + "\n\t*                       Main Menu                   *"
            + "\n\t*****************************************************"
            + "\n\t\tN - Start New Game"
            + "\n\t\tL - Load Game"
            + "\n\t\tI - Instructions"
            + "\n\t\tE - Exit"
            + "\n\t*****************************************************";
            

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }while (selection != 'E');
    }

    private String getInput() {
        String menuOption = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Choose an option:");
            
        menuOption = keyboard.nextLine();
        menuOption = menuOption.trim();
        menuOption = menuOption.toUpperCase();
   
        return menuOption;
    }

    public void doAction(char selection) {
        switch (selection) {
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
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
                       
                
        }
         
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
        instructionsView.displayInstructions();   
    }
    
}

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
        }while (selection != 'E' || selection != 'e');
    }

    private String getInput() {
        String menuOption = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Choose an option:");
            
        menuOption = keyboard.nextLine();
        menuOption = menuOption.trim();
   
        return menuOption;
    }

    public void doAction(char selection) {
        switch (selection) {
            case 'N':
            case 'n':
                this.startNewGame();
                break;
            case 'L':
            case 'l':
                this.startExistingGame();
                break;
            case 'I':
            case 'i':
                this.displayInstructions();
                break;
            case 'E':
            case 'e':
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
                       
                
        }
         
    }

    private void startNewGame() {
        GameControl.createNewGame(AgentX.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
        System.out.println("* startExistingGame function called *");
    }

    private void displayInstructions() {
        InstructionsView.displayInstructions();
        
        
    }
    
}

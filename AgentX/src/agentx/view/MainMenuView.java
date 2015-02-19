/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

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
        
        
        System.out.println("Choose your option below:");
            
        menuOption = keyboard.nextLine();
        menuOption = menuOption.trim();
   
        return menuOption;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

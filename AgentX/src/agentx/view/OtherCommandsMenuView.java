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
public class OtherCommandsMenuView {
    private final String OTHER_COMMANDS = "\n"
            + "\n\t*****************************************************"
            + "\n\t*             Other Commands Menu                   *"
            + "\n\t*****************************************************"
            + "\n\t\tC - Collect Items"
            + "\n\t\tD - Drill for Fuel"
            + "\n\t\tM - Show Game Board"
            + "\n\t\tT1 - Use Wrench"
            + "\n\t\tT2 - Use Welder"
            + "\n\t\tT3 - Use Hammer"
            + "\n\t\tT4 - Use Drill"
            + "\n\t\tI - Item Inventory"
            + "\n\t\tW - Weapons Inventory"
            + "\n\t\tFI - Fuel Inventory"
            + "\n\t\tR - Return to location"
            + "\n\t*****************************************************";
            

    public void displayOtherCommandsMenu() {
        char selection = ' ';
        do {
            System.out.println(OTHER_COMMANDS);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }while (selection != 'Q');
        return;
    }

    private String getInput() {
        String character = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Choose an option:");
            
        character = keyboard.nextLine();
        character = character.trim();
   
        return character;
    }

    public void doAction(char character) {
        switch (character) {
            case 'A':
            case 'a':
                this.displayGoal();
                break;
            case 'S':
            case 's':
                this.moveInstructions();
                break;
            case 'D':
            case 'd':
                this.inventoryInstructions();
                break;
            case 'F':
            case 'f':
                this.collectInstructions();
                break;
            case 'G':
            case 'g':
                this.fightInstructions();
            case 'H':
            case 'h':
                this.toolInstructions();
            case 'Q':
            case 'q':
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
    }
}

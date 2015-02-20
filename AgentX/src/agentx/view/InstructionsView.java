/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import java.util.Scanner;

/**
 *
 * @author matiasmikkola
 */
public class InstructionsView {

        private final String INSTRUCTIONS = "\n"
            + "\n\t*****************************************************"
            + "\n\t*                    Instructions                   *"
            + "\n\t*****************************************************"
            + "\n\t\tA - Goal of the Game"
            + "\n\t\tS - How do I move locations?"
            + "\n\t\tD - How do I see what tools and resources I have?"
            + "\n\t\tF - How do I collect resources?"
            + "\n\t\tG - How do I fight?"
            + "\n\t\tH - How do I use my tools?"
            + "\n\t\tQ - Quit Instructions Menu"
            + "\n\t*****************************************************";
            

    public void displayInstructions() {
        char selection = ' ';
        do {
            System.out.println(INSTRUCTIONS);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }while (selection != 'Q' || selection != 'q');
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

    private void displayGoal() {
        System.out.println("Goal of the game is...");
    }

    private void moveInstructions() {
        System.out.println("You move by...");
    }

    private void inventoryInstructions() {
        System.out.println("You see inventory by...");
    }

    private void collectInstructions() {
        System.out.println("Goal of the game is...");
    }

    private void fightInstructions() {
        System.out.println("Goal of the game is...");
    }

    private void toolInstructions() {
        System.out.println("Goal of the game is...");
    }
}
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
        System.out.println("You will accomplish the task of arresting Chaotica by"
                        + "\ngoing through each location and performing the tasks"
                        + "\nof that location. The locations will have tasks of "
                        + "\ngathering objects, using tools to find things and "
                        + "\nto fix your ship, learning how to use the tools, and"
                        + "\ncombat the different villains you encounter.");
    }

    private void moveInstructions() {
        System.out.println("You can move forward or backward in the time period"
                        + "\nthat you are located at as long as you meet the "
                        + "\nrequirements. To move use either of the commands"
                        + "\nlisted below:");
        System.out.println("\tF - Move Forward");
        System.out.println("\t\tThe player is moved forward on the game board"
                       + "\n\t\tunless they have yet to complete the required"
                       + "\n\t\tactions in the combat square or the ship repair"
                       + "\n\t\tsquare.");
        System.out.println("\tB - Move Backward");
        System.out.println("\t\tThe player is moved backward unless they are in "
                         + "\t\tthe first square of their section of the game"
                         + "\t\tboard.");
    }

    private void inventoryInstructions() {
        System.out.println("While exploring a location you can collect resources"
                       + "\nby completing certain tasks such as completing a "
                       + "\npuzzle, using tools (such as drilling for fuel) which"
                       + "\nyou will learn how to use as you play the game, and by"
                       + "\nusing the C - Collect Items command.");
    }

    private void collectInstructions() {
        System.out.println("When the player selects this option under the "
                + "\ninstructions menu the program will display the following "
                + "\ntext:"
                + "\nWhile exploring a location you can collect resources by "
                + "\ncompleting certain tasks such as completing a puzzle,"
                + "\nusing tools (such as drilling for fuel) which you will "
                + "\nlearn how to use as you play the game, and by using the C "
                + "\n- Collect Items command.");
    }


    private void fightInstructions() {
        System.out.println("\nThe combat menu accessed from the instructions menu "
                         + "\nwill display all of the combat menu options.");
        System.out.println("\n\tK - Kick");
        System.out.println("\n\tP - Punch");
        System.out.println("\n\tG - Grenade");
        System.out.println("\n\tD - Use Darts");
        System.out.println("\n\tS - Stab");
        System.out.println("\n\tB - Block");
        System.out.println("\n\tR - Ray Gun");
        
    }


    private void toolInstructions() {
        System.out.println("\nHow to use the tools");
        System.out.println("\n\tFI - Fuel Inventory");
        System.out.println("\n\tC - Collect Items");
        System.out.println("\n\tT1 - Use Wrench");
        System.out.println("\n\tT2 - Use Welder");
        System.out.println("\n\tT3 - Use Hammer");
        System.out.println("\n\tT4 - Use Drill");
    }
}
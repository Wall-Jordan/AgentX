/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class InventoryView {

        private final String INVENTORY = "\n"
            + "\n\t*****************************************************"
            + "\n\t*                 Inventory Types                   *"
            + "\n\t*****************************************************"
            + "\n\t\tB - Backpack"
            + "\n\t\tW - Weapons Belt"
            + "\n\t\tF - Fuel Container"
            + "\n\t\tQ - Quit Instructions Menu"
            + "\n\t*****************************************************";
            

    public void displayInventory() {
        char selection = ' ';
        do {
            System.out.println(INVENTORY);
            
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
            case 'B':
            case 'b':
                this.displayBackpack(true,true, true,true);
                break;
            case 'W':
            case 'w':
                this.displayWeaponsBelt();
                break;
            case 'F':
            case 'f':
                this.displayFuelAmmount();
                break;
            case 'Q':
            case 'q':
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
    }
    
}

    private void displayBackpack(boolean hammer, boolean welder, boolean wrench, boolean drill) {
        
        System.out.println("\n"
            + "\n\t*****************************************************"
            + "\n\t*                 Inventory Types                   *"
            + "\n\t*****************************************************");
        if (hammer == true)
        {
            System.out.println("\n\tHammer = 1");
        }
        else if (hammer == false)
        {
            System.out.println("\n\tHammer = 0");
        }
        if (welder == true)
        {
            System.out.println("\n\tWelder = 1");
        }
        else if (welder == false)
        {
            System.out.println("\n\tWelder = 0");
        }
        if (wrench == true)
        {
            System.out.println("\n\tWrench = 1");
        }
        else if (wrench == false)
        {
            System.out.println("\n\tWrench = 0");
        }
        if (drill == true)
        {
            System.out.println("\n\tDrill = 1");
        }
        else if (drill == false)
        {
            System.out.println("\n\tDrill = 0");
        }
    }

    private void displayWeaponsBelt() {
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

    private void displayFuelAmmount() {
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
    

/*
hammer;
wrench;
drill;
welder;
Grenade;
Poison Darts;
Knife;
Ray Gun;
Fuel;
*/
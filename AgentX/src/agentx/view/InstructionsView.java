/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;

/**
 *
 * @author matiasmikkola
 */
public class InstructionsView extends View {

    public InstructionsView() {
        super("\n"
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
                + "\n\t*****************************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'A':
                this.displayGoal();
                break;
            case 'S':
                this.moveInstructions();
                break;
            case 'D':
                this.inventoryInstructions();
                break;
            case 'F':
                this.collectInstructions();
                break;
            case 'G':
                this.fightInstructions();
                break;
            case 'H':
                this.toolInstructions();
                break;
            case 'Q':
                return true;
            default:
                console.println("\n Invalid selection, try again!");

        }
        return false;
    }

    private void displayGoal() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t                   Goal of the Game                   "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tYou will accomplish the task of arresting Chaotica by"
                + "\n\tgoing through each location and performing the tasks"
                + "\n\tof that location. The locations will have tasks of "
                + "\n\tgathering objects, using tools to find things and "
                + "\n\tto fix your ship, learning how to use the tools, and"
                + "\n\tcombat the different villains you encounter."
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void moveInstructions() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t                How do I move locations?              "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tYou can move forward or backward in the time period"
                + "\n\tthat you are located at as long as you meet the "
                + "\n\trequirements. To move use either of the commands"
                + "\n\tlisted below:");
        console.println("\n\tF - Move Forward");
        console.println("\t\tThe player is moved forward on the game board"
                + "\n\t\tunless they have yet to complete the required"
                + "\n\t\tactions in the combat square or the ship repair"
                + "\n\t\tsquare.");
        console.println("\tB - Move Backward");
        console.println("\t\tThe player is moved backward unless they are in "
                + "\n\t\tthe first square of their section of the game"
                + "\n\t\tboard."
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void inventoryInstructions() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t     How do I see what tools and resources I have?    "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tWhile exploring a location you can collect resources"
                + "\n\tby completing certain tasks such as completing a "
                + "\n\tpuzzle, using tools (such as drilling for fuel) which"
                + "\n\tyou will learn how to use as you play the game, and by"
                + "\n\tusing the C - Collect Items command."
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void collectInstructions() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t              How do I collect resources              "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tWhen the player selects this option under the "
                + "\n\tinstructions menu the program will display the following "
                + "\n\ttext:"
                + "\n\tWhile exploring a location you can collect resources by "
                + "\n\tcompleting certain tasks such as completing a puzzle,"
                + "\n\tusing tools (such as drilling for fuel) which you will "
                + "\n\tlearn how to use as you play the game, and by using the C "
                + "\n\t- Collect Items command."
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void fightInstructions() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t                   How do I fight?                    "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tThe combat menu accessed from the instructions menu "
                + "\n\twill display all of the combat menu options.");
        console.println("\n\t\tK - Use Knife");
        console.println("\n\t\tP - Punch");
        console.println("\n\t\tG - Grenade");
        console.println("\n\t\tD - Use Darts");
        console.println("\n\t\tB - Block");
        console.println("\n\t\tR - Ray Gun"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    private void toolInstructions() {
        console.println("\n"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t               How do I use my tools?                 "
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\tHow to use the tools");
        console.println("\n\t\tFI - Fuel Inventory");
        console.println("\n\t\tC - Collect Items");
        console.println("\n\t\tT1 - Use Wrench");
        console.println("\n\t\tT2 - Use Welder");
        console.println("\n\t\tT3 - Use Hammer");
        console.println("\n\t\tT4 - Use Drill"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

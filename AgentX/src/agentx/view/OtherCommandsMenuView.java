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
            + "\n\t\tI -  Inventory"
            + "\n\t\tR - Return to location"
            + "\n\t*****************************************************";
            

    public void displayOtherCommandsMenu() {
        String selection = " ";
        do {
            System.out.println(OTHER_COMMANDS);
            
            String input = this.getInput();
            selection = input;
            
            this.doAction(selection);
        }while (!"R".equals(selection));
        return;
    }

    private String getInput() {
        String character = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Choose an option:");
            
        character = keyboard.nextLine();
        character = character.trim();
        character = character.toUpperCase();
   
        return character;
    }

    public void doAction(String character) {
        switch (character) {
            case "C":
                this.collectItems();
                break;
            case "D":
                this.drillForFuel();
                break;
            case "M":
                this.gameBoardView();
                break;
            case "T1":
                this.useWrench();
                break;
            case "T2":
                this.useWelder();
                break;
            case "T3":
                this.useHammer();
                break;
            case "T4":
                this.useDrill();
                break;
            case "I":
                this.itemInventory();
                break;
            case "W":
                this.weaponsInventory();
                break;
            case "FI":
                this.fuelInventory();
                break;
            case "R":
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
    }
}

    private void collectItems() {
        System.out.println("\t\t*Collect Items*");
    }

    private void drillForFuel() {
        System.out.println("\t\t*Drill For Fuel");
    }

    private void gameBoardView() {
        System.out.println("\t\t***Show Game Board View***");
    }

    private void useWrench() {
        System.out.println("\t\t***Use Wrench***");
    }

    private void useWelder() {
        System.out.println("\t\t***Use Welder***");
    }

    private void useHammer() {
        System.out.println("\t\t***Use Hammer***");
    }

    private void useDrill() {
        System.out.println("\t\t***Use Drill***");
    }

    private void itemInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventory();
    }

    private void weaponsInventory() {
        System.out.println("\t\t***Call weapons inventory view***");
    }

    private void fuelInventory() {
        System.out.println("\t\t***Call fuel inventory view***");
    }
}

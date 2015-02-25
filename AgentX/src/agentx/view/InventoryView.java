/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.control.InventoryControl.fuel;
import static agentx.control.InventoryControl.darts;
import static agentx.control.InventoryControl.drill;
import static agentx.control.InventoryControl.grenade;
import static agentx.control.InventoryControl.gun;
import static agentx.control.InventoryControl.hammer;
import static agentx.control.InventoryControl.knife;
import static agentx.control.InventoryControl.welder;
import static agentx.control.InventoryControl.wrench;
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
        character = character.toUpperCase();
   
        return character;
    }

    public void doAction(char character) {
        
        switch (character) {
            case 'B':
                this.displayBackpack();
                break;
            case 'W':
                this.displayWeaponsBelt();
                break;
            case 'F':
                this.displayFuelAmmount();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n Invalid selection, try again!");
                
    }
    
}

    private void displayBackpack() {
        
        System.out.println("\n"
            + "\n\t*****************************************************"
            + "\n\t*                    Backpack                       *"
            + "\n\t*****************************************************");
        if (hammer() == true)
        {
            System.out.println("\n\tHammer = 1");
        }
        else if (hammer() == false)
        {
            System.out.println("\n\tHammer = 0");
        }
        if (welder() == true)
        {
            System.out.println("\n\tWelder = 1");
        }
        else if (welder() == false)
        {
            System.out.println("\n\tWelder = 0");
        }
        if (wrench() == true)
        {
            System.out.println("\n\tWrench = 1");
        }
        else if (wrench() == false)
        {
            System.out.println("\n\tWrench = 0");
        }
        if (drill() == true)
        {
            System.out.println("\n\tDrill = 1");
        }
        else if (drill() == false)
        {
            System.out.println("\n\tDrill = 0");
        }
    }

    private void displayWeaponsBelt() {
        System.out.println("\n"
            + "\n\t*****************************************************"
            + "\n\t*                 Weapons Belt                      *"
            + "\n\t*****************************************************");
        System.out.println("\n\tGrenades = " + grenade());
        System.out.println("\n\tPoison darts = " + darts());
        if (gun() == true)
        {
            System.out.println("\n\tRay Gun = 1");
        }
        else if (gun() == false)
        {
            System.out.println("\n\tRay Gun = 0");
        }
        if (knife() == true)
        {
            System.out.println("\n\tKnife = 1");
        }
        else if (knife() == false)
        {
            System.out.println("\n\tKnife = 0");
        }
    }

    private void displayFuelAmmount() {
        System.out.println("\n"
            + "\n\t*****************************************************"
            + "\n\t*                 Fuel Ammount                      *"
            + "\n\t*****************************************************");
        System.out.println("\n\tYou have " + fuel() + " gallons of fuel.");
    }

}
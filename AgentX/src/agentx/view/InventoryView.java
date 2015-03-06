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
import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class InventoryView extends View {

    public InventoryView() {
        super("\n"
                + "\n\t*****************************************************"
                + "\n\t*                 Inventory Types                   *"
                + "\n\t*****************************************************"
                + "\n\t\tB - Backpack"
                + "\n\t\tW - Weapons Belt"
                + "\n\t\tF - Fuel Container"
                + "\n\t\tQ - Quit Instructions Menu"
                + "\n\t*****************************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
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
                return true;
            default:
                System.out.println("\n Invalid selection, try again!");
        }
        return true;
    }

    private void displayBackpack() {

        System.out.println("\n"
                + "\n\t*****************************************************"
                + "\n\t*                    Backpack                       *"
                + "\n\t*****************************************************");
        if (hammer() == true) {
            System.out.println("\n\tHammer = 1");
        } else {
            System.out.println("\n\tHammer = 0");
        }
        if (welder() == true) {
            System.out.println("\n\tWelder = 1");
        } else {
            System.out.println("\n\tWelder = 0");
        }
        if (wrench() == true) {
            System.out.println("\n\tWrench = 1");
        } else {
            System.out.println("\n\tWrench = 0");
        }
        if (drill() == true) {
            System.out.println("\n\tDrill = 1");
        } else {
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
        if (gun() == true) {
            System.out.println("\n\tRay Gun = 1");
        } else {
            System.out.println("\n\tRay Gun = 0");
        }
        if (knife() == true) {
            System.out.println("\n\tKnife = 1");
        } else {
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

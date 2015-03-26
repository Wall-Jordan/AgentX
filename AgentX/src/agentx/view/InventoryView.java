/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
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
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class InventoryView extends View {
    protected final static PrintWriter console = AgentX.getOutFile();
    
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
                console.println("\n Invalid selection, try again!");
        }
        return true;
    }

    private void displayBackpack() {

        console.println("\n"
                + "\n\t*****************************************************"
                + "\n\t*                    Backpack                       *"
                + "\n\t*****************************************************");
        if (hammer() == true) {
            console.println("\n\tHammer = 1");
        } else {
            console.println("\n\tHammer = 0");
        }
        if (welder() == true) {
            console.println("\n\tWelder = 1");
        } else {
            console.println("\n\tWelder = 0");
        }
        if (wrench() == true) {
            console.println("\n\tWrench = 1");
        } else {
            console.println("\n\tWrench = 0");
        }
        if (drill() == true) {
            console.println("\n\tDrill = 1");
        } else {
            console.println("\n\tDrill = 0");
        }
    }

    private void displayWeaponsBelt() {
        console.println("\n"
                + "\n\t*****************************************************"
                + "\n\t*                 Weapons Belt                      *"
                + "\n\t*****************************************************");
        console.println("\n\tGrenades = " + grenade());
        console.println("\n\tPoison darts = " + darts());
        if (gun() == true) {
            console.println("\n\tRay Gun = 1");
        } else {
            console.println("\n\tRay Gun = 0");
        }
        if (knife() == true) {
            console.println("\n\tKnife = 1");
        } else {
            console.println("\n\tKnife = 0");
        }
    }

    private void displayFuelAmmount() {
        console.println("\n"
                + "\n\t*****************************************************"
                + "\n\t*                 Fuel Ammount                      *"
                + "\n\t*****************************************************");
        console.println("\n\tYou have " + fuel() + " gallons of fuel.");
    }

}

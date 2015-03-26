/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.view.ViewInterface.View;
import java.io.PrintWriter;

/**
 *
 * @author Jordan
 */
public class OtherCommandsMenuView extends View {
    protected final static PrintWriter console = AgentX.getOutFile();

    public OtherCommandsMenuView() {
        super("\n"
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
                + "\n\t*****************************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        String choice = value;

        switch (choice) {
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
                InventoryView inventoryView = new InventoryView();
                inventoryView.display();
                break;
            case "W":
                this.weaponsInventory();
                break;
            case "FI":
                this.fuelInventory();
                break;
            case "R":
                return false;
            default:
                System.out.println("\n Invalid selection, try again!");

        }
        return true;
    }

    private void collectItems() {
        console.println("\t\t*Collect Items*");
    }

    private void drillForFuel() {
        console.println("\t\t*Drill For Fuel");
    }

    private void gameBoardView() {
        console.println("\t\t***Show Game Board View***");
    }

    private void useWrench() {
        console.println("\t\t***Use Wrench***");
    }

    private void useWelder() {
        console.println("\t\t***Use Welder***");
    }

    private void useHammer() {
        console.println("\t\t***Use Hammer***");
    }

    private void useDrill() {
        console.println("\t\t***Use Drill***");
    }

    private void weaponsInventory() {
        console.println("\t\t***Call weapons inventory view***");
    }

    private void fuelInventory() {
        console.println("\t\t***Call fuel inventory view***");
    }
}

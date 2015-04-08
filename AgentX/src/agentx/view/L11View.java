/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import static agentx.view.L10View.ship2;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L11View extends View {

    public L11View() {
        super("\nYou are standing at the enterance to the school. "
                + "\nThere is a keypad here and a sign that says..."
                + "\n\t~~~~~~~~~~~~~~~~~~~~"
                + "\n\tX=(2*(X-2)+(96/6))/4"
                + "\n\t~~~~~~~~~~~~~~~~~~~~"
                + "\nEnter the value of X to proceed."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nI - Instructions"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for(String item : locations.get(11).getToDoList()){
                    console.println("*"+item);
                }
                return false;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "V":
                console.println("Okay, you can come back later.");
                return true;
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(11).getFuel();
                        locations.get(11).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L11View.java", pce.getMessage());
                }
                break;
            default:
                try {
                    double userIn = Double.parseDouble(input);
                    boolean test = PuzzleControl.calcEntrance(userIn);
                    if (test == true) {
                        this.console.println("\n\tCORRECT! You may now proceed.");
                        locations.get(11).setComplete(true);
                        break;
                    } else {
                        this.console.println("\n\tWRONG!!! Please try again.");
                        return false;
                    }
                } catch (NumberFormatException nf) {
                    this.console.println("\n You must enter in a number.");
                }
                break;
        }
        return false;
    }
}

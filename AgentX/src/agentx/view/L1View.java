/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L1View extends View {

    public L1View() {
        super("\n"
                + "\nInstruction for using the drill:"
                + "\nYou pick a drillbit that you want to use, and search"
                + "\nfor fuel! Fuel is needed to use the ship, which allows you "
                + "\nto look for Chaotica in a different time. Lets try this out:"
                + "\n"
                + "\nSelect the drill by typing T4"
                + "\nSelect the drillbit you want to use: [1, 2]"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nI  - Instructions"
                + "\nV  - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
        String value = (String) obj;
        value = value.toUpperCase();

        switch (value) {
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (6 <= drillDepth) {
                        fuel = locations.get(1).getFuel();
                        locations.get(1).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                        console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L1View.java", pce.getMessage());
                }

                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(1).setComplete(true);
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
        }
        return false;

    }
}

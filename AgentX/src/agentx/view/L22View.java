/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.getDrillBit;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L22View extends ViewInterface.View {

    public L22View() {
        super("The Agent explored the surroundings of the old village, and found a waterfall. "
                + "Could this be where Chaotica is hiding? Better explore.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nI  - Instructions"
                + "\nV  - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = AgentX.getCurrentGame().getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(22).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
            case "V":
                locations.get(22).setComplete(true);
                return true;
            case "T4":
                try {
                    String drillBit = getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(22).getFuel();
                        locations.get(22).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L21View.java", pce.getMessage());
                }

                break;
        }

        return false;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameControl;
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
public class L24View extends ViewInterface.View {

    public L24View() {
        super("How lucky! There is a box of supplies right next to the toolbox. How convenient.\n"
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
                for (String item : locations.get(24).getToDoList()) {
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
            case "T3 SUPPLY BOX":
                if (locations.get(24).getCollectItems() != null) {
                    console.println("Finally some food! I've traveled through years and not eaten "
                            + "a thing! I'm gonna eat this snickers right away. Omnomnom! \n");
                    GameControl.addStamina(20);
                    GameControl.addHealth(20);
                    locations.get(24).setCollectItems(null);
                    locations.get(24).removeToDoListItem("Open SupplyBox (Hint: Use a tool");
                }
                break;
            case "SEA FOOD":
                GameControl.addStamina(40);
                GameControl.addHealth(40);
                console.println("Mmm, that was some good food.");
                break;
            case "V":
                locations.get(24).setComplete(true);
                return true;
            case "T4":
                try {
                    String drillBit = getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(24).getFuel();
                        locations.get(24).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L24View.java", pce.getMessage());
                }

                break;
        }

        return false;
    }

}

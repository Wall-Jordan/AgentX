/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.getDrillBit;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import static agentx.view.L20View.ship3;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L27View extends ViewInterface.View {

    public L27View() {
        super("You come back to the ship. Looks like the its broken, again. Better fix it.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
                + "\nI  - Instructions"
                + "\nV  - View Gameboard"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(27).getToDoList()) {
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
                return true;
            case "T1 SHIP":
                console.println("You fixed your ship! Great Wrenching work!");
                locations.get(0).removeToDoListItem("Repair Ship (Hint: use a tool that you have collected)");
                ship3.setStatus(1);
                break;

            case "T4":
                try {
                    String drillBit = getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(21).getFuel();
                        locations.get(21).setFuel(0);

                    }
                    InventoryControl.AddFuel3(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship3.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L21View.java", pce.getMessage());
                }

                break;
        }

        return false;
    }

}

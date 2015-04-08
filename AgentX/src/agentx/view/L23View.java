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
public class L23View extends ViewInterface.View {

    public L23View() {
        super("You found an old toolbox under the waterfall. Wonder whats inside of it?\n"
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
        locations = GameBoardControl.getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(23).getToDoList()) {
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
            case "T3 TOOLBOX":
                console.println("There is a wrench in the box! It is shiny and ready to be used!\n");
                locations.get(23).removeToDoListItem("Open ToolBox (Hint: Use a tool)");
                break;
            case "C WRENCH":
                if(locations.get(23).getCollectItems() != null){
                locations.get(23).setCollectItems(null);
                locations.get(23).removeToDoListItem("Collect Wrench");                
                AgentX.getPlayer().backpack.addTool("Wrench");
                }else{
                    console.println("You already have the wrench");
                }
                locations.get(23).setComplete(true);
                break;
            case "V":
                return true;
            case "T4":
                try {
                    String drillBit = getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(23).getFuel();
                        locations.get(23).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L23View.java", pce.getMessage());
                }

                break;
        }

        return false;
    }
}

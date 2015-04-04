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
import agentx.model.TimeShip;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L0View extends View {

    public static TimeShip ship1 = new TimeShip();

    public L0View() {
        super("\nYou crashed into a construction site.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(0).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "C DRILL":
                if (locations.get(0).getCollectItems() != null) {
                    locations.get(0).setCollectItems(null);
                    locations.get(0).removeToDoListItem("Collect drill");
                    console.println("Great Job! You stole a drill.");
                    AgentX.getPlayer().backpack.addTool("Drill");
                    locations.get(0).setComplete(true);
                } else {
                    console.println("You already took the drill.");
                }
                break;
            case "T4":
                if (locations.get(0).getCollectItems() != null) {
                    console.println("You don't have a drill yet.");
                }else{
                    try {
                        String drillBit = InventoryControl.getDrillBit();

                        double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                        double fuel = 0;
                        if (6 <= drillDepth) {
                            fuel = locations.get(0).getFuel();
                            locations.get(0).setFuel(0);
                        }
                        InventoryControl.AddFuel1(fuel);
                        console.println("You collected " + fuel + " gallons of fuel. You now have " + ship1.fuel.getGallons() + " gallons of fuel.");
                    } catch (PuzzleControlExceptions pce) {
                        ErrorView.display("L0View.java", pce.getMessage());
                    }
                }

                break;
        }

        return false;
    }
}

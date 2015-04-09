/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameControl;
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
public class L5View extends View {
    public L5View() {
        super("\nThere's a rock here. Try smashing it open with the Hammer you picked up in the last location."
                + "\nTo use the hammer you type in the command T3 followed by what you want to use the hammer on."
                + "\nSuch As: T3 Rock"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nI  - Instructions"
                + "\nV  - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(5).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(5).setComplete(true);
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (6 <= drillDepth) {
                        fuel = locations.get(5).getFuel();
                        locations.get(5).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                        console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L2View.java", pce.getMessage());
                }

                break;
            case "T3 ROCK":
                if(locations.get(5).getCollectItems() != null){
                    locations.get(5).removeToDoListItem("Use Hammer on Rock");
                    locations.get(5).setCollectItems(null);
                    GameControl.addStamina(10);
                    GameControl.addHealth(10);
                    console.println("You broke the rock, found some water inside, drank it, and increased your stamina.");
                }else{
                    console.println("You already broke the rock.");
                }
                
                break;
        }

        return false;
    }
}

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
 * @author Chris
 */
public class L14View extends View {

    public L14View() {
        super("\nYou are in a robotics lab of some kind."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nI  - Instructions"
                + "\nV  - Return to Map"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
        String input = (String) obj;
        
        switch (input) {
            case "TL":
                for (String item : locations.get(14).getToDoList()) {
                    console.println("*" + item);
                }
                return false;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                return true;
            case "C GRENADES":
                if(locations.get(14).getCollectItems() != null)
                {
                locations.get(14).setCollectItems(null);
                locations.get(14).removeToDoListItem("Collect Grenades");
                AgentX.getPlayer().weaponsBelt.addWeapon("Grenades", 5);
                locations.get(14).setComplete(true);
                console.println("These grenades might come in handy later.");
                }else{
                    console.println("You already took the grenades");
                }
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(14).getFuel();
                        locations.get(14).setFuel(0);

                    }

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L14View.java", pce.getMessage());
                }
                break;
        }
        
        return false;
    }
}

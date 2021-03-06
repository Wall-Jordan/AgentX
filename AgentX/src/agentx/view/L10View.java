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
public class L10View extends View {

    public L10View() {
        super("\nYou crashed outside an old school."
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
        
        switch(input){
            case "TL":
                for(String item : locations.get(10).getToDoList()){
                    console.println("*"+item);
                }
                return false;
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
            case "C RAY GUN":
                if(locations.get(10).getCollectItems() != null)
                {
                locations.get(10).setCollectItems(null);
                locations.get(10).removeToDoListItem("Collect Ray Gun");
                AgentX.getPlayer().weaponsBelt.addWeapon("Ray Gun", 4);
                locations.get(10).setComplete(true);
                console.println("You acquired Chaotica's Ray Gun! Better save it for evidence!");
                }else{
                    console.println("You already took the ray gun");
                }
                break;
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(10).getFuel();
                        locations.get(10).setFuel(0);
                       
                    } 

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");
                    
                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L10View.java", pce.getMessage());
                }
                break;
        }
        
        return false;
    }
}

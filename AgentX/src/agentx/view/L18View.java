/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
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
public class L18View extends View {

    public L18View() {
        super("\nYou're back at your time machine. there appears to be a hole in your fuek tank."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
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
                for (String item : locations.get(18).getToDoList()) {
                    console.println("*" + item);
                }
                return false;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                return true;
            case "T2 TIME MACHINE":
                if(!L10View.ship2.getStatus())
                {
                    L10View.ship2.setStatus(true);
                    console.println("With dexterous skill you weld the crack in your fuel tank.");
                    locations.get(18).setComplete(true);
                    return true;
                }else{
                    console.println("You already fixed the ship.");
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
                        fuel = locations.get(18).getFuel();
                        locations.get(18).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L18View.java", pce.getMessage());
                }
                break;
        }
        
        return false;
    }
}

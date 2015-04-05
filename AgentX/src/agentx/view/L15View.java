/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.GameControl;
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
public class L15View extends View {

    public L15View() {
        super("\nYou are in the cafeteria."
                + "\nThere's a lot of rotten food out in the buffet but the fridge appears to still be working."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nI - Instructions"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;
        
        switch (input) {
            case "TL":
                for (String item : locations.get(15).getToDoList()) {
                    console.println("*" + item);
                }
                return false;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(15).setComplete(true);
                return true;
            case "C FOOD":
                if(locations.get(15).getCollectItems() != null){
                    locations.get(15).setCollectItems(null);
                    locations.get(15).removeToDoListItem("Collect Food");
                    GameControl.addStamina(20);
                    GameControl.addHealth(20);
                    console.println("Mmm, that food was delicious!");
                }else{
                    console.println("You already ate the food");
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
                        fuel = locations.get(15).getFuel();
                        locations.get(15).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L15View.java", pce.getMessage());
                }
                break;
        }
        
        return false;
    }
}

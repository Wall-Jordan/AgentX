/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

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
 * @author Chris
 */
public class L10View extends View {

    public static TimeShip ship2 = new TimeShip();
    public L10View() {
        super("\nYou crashed outside an old school."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
                + "\nI - Instructions"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = GameBoardControl.locations;
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
                locations.get(10).setComplete(true);
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
                    if (drillDepth == 4) {
                        fuel = locations.get(10).getFuel();
                        locations.get(10).setFuel(0);
                       
                    } 

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");
                    
                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L10View.java", pce.getMessage());
                }
                break;
        }
        
        return false;
    }
}

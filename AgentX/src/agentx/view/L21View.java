/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.fuel;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.FuelContainer;
import agentx.model.Location;
import agentx.model.TimeShip;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L21View extends ViewInterface.View {
    
    public static TimeShip ship = new TimeShip();
    
            
    public L21View() {
        super("You moved into an old village, which is empty. You move closer, and notice"
                + "that there are bodies everywhere. Maybe this is where Chaotica is right now!\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(21).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
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

                    InventoryControl.AddFuel(fuel);
                    console.println(ship.fuel.getGallons());
                    
                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L21View.java", pce.getMessage());
                }

                break;
        }

        return true;
    }

    public String getDrillBit() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Choose drillbit:");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                break;
            }
        } catch (Exception e) {
            console.println("Error reading input: " + e.getMessage());
        }

        return selection;

    }
}

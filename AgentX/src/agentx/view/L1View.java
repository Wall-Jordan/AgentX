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
import static agentx.view.L0View.ship1;
import static agentx.view.L20View.ship3;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L1View extends View {

    public L1View() {
        super("\n"
                + "\nInstruction for using the drill:"
                + "\nYou pick a drillbit that you want to use, and search"
                + "\nfor fuel! Fuel is needed to use the ship, which allows you "
                + "\nto look for Chaotica in a different time. Lets try this out:"
                + "\n"
                + "\nSelect the drill by typing T4"
                + "\nSelect the drillbit you want to use: [1, 2]"
                + "\n****************************************"
                + "\nV - Return to Map"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String value = (String) obj;
        value = value.toUpperCase();

        switch (value) {
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (6 <= drillDepth) {
                        fuel = locations.get(1).getFuel();
                        locations.get(1).setFuel(0);

                    }

                    InventoryControl.AddFuel1(fuel);
                        console.println("You collected " + fuel + " gallons of fuel. You now have " + ship1.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L1View.java", pce.getMessage());
                }

                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(1).setComplete(true);
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
        }
        return false;

    }
}

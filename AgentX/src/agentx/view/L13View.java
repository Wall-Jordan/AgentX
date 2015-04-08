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
public class L13View extends View {

    public L13View() {
        super("\nYou have now entered the shop teachers office"
                + "\nAs you explore the office you discover a set\n"
                + "\nof instructions for the welder you found in the shop.\n"
                + "\n"
                + "\nThe instructions said:"
                + "\n\tHow to use your Edison 5000:"
                + "\n\tThe Edison 5000 is the top of the line welder that is ran by"
                + "\n\ta computer, which makes it very simple to use."
                + "\n\t1.)Choose what metal object needs welded"
                + "\n\t2.)You simply type in \"T2\" and then you type in the name of"
                + "\n\tobject the you want welded such as \"ship\""
                + "\n"
                + "\nNow it is your turn to try it!"
                + "\nIn the office you found a few metal pieces that"
                + "\ncame from a puzzle."
                + "\nTry out the weld command by typing in: T2 Puzzle\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nI - Instructions"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(13).getToDoList()) {
                    console.println("*" + item);
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
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(13).getFuel();
                        locations.get(13).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L13View.java", pce.getMessage());
                }
                break;
            case "T2 PUZZLE":
                console.println("\tCongratulations you welded the puzzle together!"
                    + "\n\tThe puzzle says: 2046");
                locations.get(13).setComplete(true);
            break;
        }

        return false;
    }
}

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
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L3View extends View {

    public L3View() {
        super("You find Jackie Chan and he tells you the following: "
                + "\nThe number of attacks you can chain together is "
                + "\nlimted by the amount of stamina you have."
                + "\nyou can use any weapon that you have on your weapon"
                + "\n belt or you can use your fists."
                + "\nif you want to block it takes up one spot in your attack"
                + "\n chain and blocks 50% of the opponents attack damage."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
                + "\nI - Instructions"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(3).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(3).setComplete(true);
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
                        fuel = locations.get(3).getFuel();
                        locations.get(3).setFuel(0);

                    }

                    InventoryControl.AddFuel1(fuel);
                        console.println("You collected " + fuel + " gallons of fuel. You now have " + ship1.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L2View.java", pce.getMessage());
                }

                break;
        }

        return false;
    }
}

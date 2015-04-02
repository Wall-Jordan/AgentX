/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.PuzzleControl;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L11View extends View {

    public L11View() {
        super("You are standing at the enterance to the school. "
                + "\nThere is a keypad here and a sign that says..."
                + "\n********************"
                + "\nX=(2*(X-2)+(96/6))/4"
                + "\n********************"
                + "\nEnter the value of X to proceed.");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(11).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "6":
                Double userIn = Double.parseDouble(input);
                boolean test = PuzzleControl.calcEntrance(userIn);
                if (test == true) {
                    this.console.println("\n\tCORRECT! You may now proceed.");
                    return true;
                } else {
                    this.console.println("\n\tWRONG!!! Please try again.");
                    return false;
                }
            case "O":
                break;
        }

        return true;
    }
}

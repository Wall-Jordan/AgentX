/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L4View extends View{
    public L4View() {
        super("At the construction site you lift up a board and find a hammer!\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(4).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                break;
            case "V":
                return true;
            case "C HAMMER":
                //Add drill to array list
                locations.get(0).removeCollectItem("HAMMER");
                locations.get(0).removeToDoListItem("Collect hammer");
                break;
        }

        return true;
    }
}

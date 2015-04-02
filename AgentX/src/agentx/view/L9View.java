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
public class L9View extends View{
    public L9View() {
        super("You crashed into a construction site.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(9).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                break;
            case "C DRILL":
                //Add drill to array list
                
                break;
        }

        return true;
    }
}

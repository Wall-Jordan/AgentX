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
public class L3View extends View {

    public L3View() {
        super("You find Jackie Chan and he tells you the following: "
                + "The number of attacks you can chain together is limted by the amount of stamina you have."
                + "you can use any weapon that you have on your weapon belt or you can use your fists."
                + "if you want to block it takes up one spot in your attack chain and blocks 50% of the opponents attack damage."
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
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
                break;
            case "V":
                return true;
        }

        return true;
    }
}

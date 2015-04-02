/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.control.GameBoardControl.createLocations;
import agentx.model.Location;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L26View extends ViewInterface.View {

    public L26View() {
        super("Looks like somebody has been at the village meanwhile we were at the waterfall.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = createLocations();
        String input = (String) obj;
        
        switch(input){
            case "TL":
                break;
            case "O":
                break;
        }
        
        return true;
    }
}

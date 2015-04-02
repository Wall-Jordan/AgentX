/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.model.Location;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L27View extends ViewInterface.View {

    public L27View() {
        super("Looks like the Ship is broken, again. Better fix it.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
        String input = (String) obj;
        
        switch(input){
            case "TL":
                for(String item : locations.get(27).getToDoList()){
                    console.println("*"+item);
                }
                break;
            case "O":
                break;
        }
        
        return true;
    }
}

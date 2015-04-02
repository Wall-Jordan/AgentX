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
public class L25View extends ViewInterface.View {

    public L25View() {
        super("You walk back to the village. I wonder if you need to use the Ship again. Better"
                + "drill for more fuel.\n"
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
                for(String item : locations.get(25).getToDoList()){
                    console.println("*"+item);
                }
                break;
            case "O":
                break;
        }
        
        return true;
    }
}

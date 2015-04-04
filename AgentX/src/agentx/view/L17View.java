/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.control.GameBoardControl.createLocations;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L17View extends View {

    public L17View() {
        super("You crashed outside an old school"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = createLocations();
        String input = (String) obj;
        
        switch(input){
            case "TL":
                for(String item : locations.get(17).getToDoList()){
                    console.println("*"+item);
                }
                break;
            case "V":
                locations.get(17).setComplete(true);
                return true;
        }
        
        return false;
    }
}

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
public class L28View extends ViewInterface.View {

    public L28View() {
        super("CHAOTICA IS STANDING IN FRONT OF YOU! ATTACK!\n"
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
                for(String item : locations.get(28).getToDoList()){
                    console.println("*"+item);
                }
                break;
            case "O":
                break;
        }
        
        return true;
    }
}

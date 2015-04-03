/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import agentx.model.Location;
import agentx.model.TimeShip;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L10View extends View {

    public static TimeShip ship2 = new TimeShip();
    public L10View() {
        super("\nYou crashed outside an old school\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\n****************************************");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;
        
        switch(input){
            case "TL":
                for(String item : locations.get(10).getToDoList()){
                    console.println("*"+item);
                }
                return false;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "B":
                GameBoardView gameBoard = new GameBoardView();
                gameBoard.displayGameBoard();
        }
        
        return true;
    }
}

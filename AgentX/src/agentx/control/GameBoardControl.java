/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.model.GameBoard;
import agentx.model.Location;
import agentx.model.Scene;
import agentx.model.Scene.SectionOne;
import agentx.exceptions.GameBoardControlExceptions;

/**
 *
 * @author Chris
 */
public class GameBoardControl {
    
    public static GameBoard createGameBoard() throws GameBoardControlExceptions {
        System.out.println("called createGameboard");
        return null;
    }
    
    public static void moveActorsToStartingLocation(GameBoard gameBoard) {
        System.out.println("Move actors to starting locatinon");
    }
    
    private static void assignScenesToLocations(GameBoard gameBoard, Scene[] scenes) {
        Location[][] locations = gameBoardLocations();
        
        
        
    }

    private static Location[][] gameBoardLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private static void assignScenesToBlock(GameBoard gameBoard, Scene[] scenes) {
        Location[][] locations = gameBoard.getLocations();
        
     //   locations[0][0].setBlock(scenes[SectionOne.drill.ordinal()]);
    }
}

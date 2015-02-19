/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentx;
import agentx.model.Actor;
import agentx.model.Backpack;
import agentx.model.Boss;
import agentx.model.Fuel_Container;
import agentx.model.Inventory;
import agentx.model.Game;
import agentx.model.GameBoard;
import agentx.model.Player;
import agentx.model.Section;
import agentx.model.TimeShip;
import agentx.model.Weapon;
import agentx.model.Weapons_Belt;
import agentx.model.Location;
import agentx.model.TakeOff;
import agentx.model.Explore;
import agentx.model.Combat;
import agentx.model.Puzzle;
import agentx.view.StartProgramView;
import static java.lang.Boolean.TRUE;


/**
 *
 * @author matiasmikkola
 */
public class AgentX {
    

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AgentX.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AgentX.player = player;
    }
    
    
}

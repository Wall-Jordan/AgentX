/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.exceptions.ProgramControlExceptions;
import agentx.model.Player;

/**
 *
 * @author Jordan
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) throws ProgramControlExceptions {
        if (playersName == null){
            throw new ProgramControlExceptions("You have to enter a name");
          
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        AgentX.setPlayer(player);
        
        return player;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentx;
import agentx.model.Inventory;
import agentx.model.Game;
import agentx.model.Player;


/**
 *
 * @author matiasmikkola
 */
public class AgentX {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /***********************************************************************
         * Initialize player instance.
         * Written by Team 3
         **********************************************************************/
        Player playerOne = new Player();
       
        playerOne.setName("Fred Flintstone");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        /***********************************************************************
         * Initialize inventory instance.
         * Written by Chris Hanna
         **********************************************************************/
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setItem("Wrench");
        inventoryOne.setQuantity(1);
        inventoryOne.setType(3);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        /***********************************************************************
         * Initialize game instance.
         * Written by Jordan Wall
         **********************************************************************/
        Game gameOne = new Game();
        
        gameOne.setGameName("Agent Fred");
        gameOne.setSaveTime("1.30.15 23:59");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentx;
import agentx.model.Backpack;
import agentx.model.Fuel_Container;
import agentx.model.Inventory;
import agentx.model.Game;
import agentx.model.Player;
import agentx.model.Weapon;
import agentx.model.Weapons_Belt;


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
        
        /***********************************************************************
         * Initialize Backpack instance.
         * Written by Chris Hanna
         **********************************************************************/
        Backpack backpackOne = new Backpack();
        
        backpackOne.setBackpackItems("Drill");
        String backpackInfo = backpackOne.toString();
        System.out.println(backpackInfo);
        
        /***********************************************************************
         * Initialize Fuel_Container instance.
         * Written by Chris Hanna
         **********************************************************************/
        Fuel_Container fuel_containerOne = new Fuel_Container();
        
        fuel_containerOne.setGallons(0);
        String fuel_containerInfo = fuel_containerOne.toString();
        System.out.println(fuel_containerInfo);
        
        /***********************************************************************
         * Initialize Weapon instance.
         * Written by Chris Hanna
         **********************************************************************/
        Weapon weaponOne = new Weapon();
        
        weaponOne.setDamage(0);
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        /***********************************************************************
         * Initialize Weapons_Belt instance.
         * Written by Chris Hanna
         **********************************************************************/
        Weapons_Belt weapons_beltOne = new Weapons_Belt();
        
        weapons_beltOne.setBeltItems("Knife");
        String weapons_beltInfo = weapons_beltOne.toString();
        System.out.println(weapons_beltInfo);
    }
    
}

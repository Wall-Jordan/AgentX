/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentx;
import agentx.model.Actor;
import agentx.model.Backpack;
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
import static java.lang.Boolean.TRUE;


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
        
        /***********************************************************************
         * Initialize Actor instance.
         * Written by Jordan Wall
         **********************************************************************/
        Actor actorOne = new Actor();
        
        actorOne.setStamina(68.0);
        actorOne.setDescription("Agent-X the CIA agent trying to save the world"
                + " by finding the terrorist Chaotica.");
        actorOne.setHealth(99.00);
        actorOne.setType("main player");
        
        String actorOneInfo = actorOne.toString();
        System.out.println(actorOneInfo);
        
        
        /***********************************************************************
         * Initialize TimeShip instance.
         * Written by Jordan Wall
         **********************************************************************/
        TimeShip timeShipOne = new TimeShip();
        
        timeShipOne.setFuel(20.0);
        timeShipOne.setStatus(1);
        timeShipOne.setDescription("State of the art time ship. Top of it's class."
                + " Goverment only edition.");
        
        String timeShipInfo = timeShipOne.toString();
        System.out.println(timeShipInfo);
        
        /***********************************************************************
         * Initialize GameBoard instance.
         * Written by Jordan Wall
         **********************************************************************/
        GameBoard gameBoardOne = new GameBoard();
        
        gameBoardOne.setSection(1);
        
        String gameBoardInfo = gameBoardOne.toString();
        System.out.println(gameBoardInfo);
        
        /***********************************************************************
         * Initialize Section instance.
         * Written by Jordan Wall
         **********************************************************************/
        Section sectionOne = new Section();
        
        sectionOne.setLocation(4);
        
        String sectionInfo = sectionOne.toString();
        System.out.println(sectionInfo);
        
        /***********************************************************************
         * Initialize Location instance.
         * Written by Matias Mikkola
         **********************************************************************/
        
        Location locationOne = new Location();
        
        locationOne.setVisited(TRUE);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
      
        /***********************************************************************
         * Initialize Puzzle instance.
         * Written by Matias Mikkola
         **********************************************************************/
        
        Puzzle puzzleOne = new Puzzle();
        
        puzzleOne.setSolved(1);
        
        String puzzleInfo = puzzleOne.toString();
        System.out.println(puzzleInfo);
        
        /***********************************************************************
         * Initialize Combat instance.
         * Written by Matias Mikkola
         **********************************************************************/
        
        Combat combatOne = new Combat();
        
        combatOne.setBoss(2);
        
        String combatInfo = combatOne.toString();
        System.out.println(combatInfo);
      
        /***********************************************************************
         * Initialize Explore instance.
         * Written by Matias Mikkola
         **********************************************************************/
        
        Explore exploreOne = new Explore();
        
        exploreOne.setFuel(5);
        exploreOne.setTool("Welder");
        exploreOne.setWeapon("Drill");
        exploreOne.setInstructions("Find Welder");
        
        String exploreInstructions = exploreOne.toString();
        System.out.println(exploreInstructions);
      
        /***********************************************************************
         * Initialize TakeOff instance.
         * Written by Matias Mikkola
         **********************************************************************/
        
        TakeOff takeOffOne = new TakeOff();
        
        takeOffOne.setInstructions(1);
        
        String takeOffInstructions = takeOffOne.toString();
        System.out.println(takeOffInstructions);
    }
}

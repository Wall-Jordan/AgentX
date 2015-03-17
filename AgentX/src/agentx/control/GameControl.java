/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.model.Backpack;
import agentx.model.Game;
import agentx.model.GameBoard;
import agentx.model.Inventory;
import agentx.model.Player;
import agentx.model.TimeShip;
import agentx.view.GameBoardView;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Chris
 */
public class GameControl {

    public static void createNewGame(Player player) {
        

        Game game = new Game();
        AgentX.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        TimeShip timeShip = new TimeShip();
        game.setTimeShip(timeShip);
        
        GameBoard gameBoard = new GameBoard();
        game.setGameBoard(gameBoard);
        
        GameBoardControl.moveActorsToStartingLocation(gameBoard);
        
        GameBoardView gameBoardView = new GameBoardView();
        
    }
    


public static Inventory[] createInventoryList() {
    
    return null;
}

public static Backpack[] createBackpackList() {
    Backpack[] backpack =
        new Backpack[4];

    Backpack hammer = new Backpack();
    hammer.setDescription("Hammer");
    backpack[Tool.hammer.ordinal()] = hammer;

    Backpack welder = new Backpack();
    welder.setDescription("Welder");
    backpack[Tool.welder.ordinal()] = welder;

    Backpack wrench = new Backpack();
    wrench.setDescription("Wrench");
    backpack[Tool.wrench.ordinal()] = wrench;

    Backpack drill = new Backpack();
    drill.setDescription("Drill");
    backpack[Tool.drill.ordinal()] = drill; 
    
    return backpack;

}

    public enum Tool {
        hammer,
        welder,
        wrench,
        drill;
    }   
    
    public class ListTools  {

	public ListTools() {
	   ArrayList<String> listtools = new ArrayList<>();
	   listtools.add("Hammer");
	   listtools.add("Welder");
	   listtools.add("Wrench");
	   listtools.add("Drill");

	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   for(String counter: listtools){
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listtools);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   for(String counter: listtools){
			System.out.println(counter);
		}
	
                }
            }
        }

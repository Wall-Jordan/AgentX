/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.exceptions.GameControlExceptions;
import agentx.model.Backpack;
import agentx.model.Boss;
import agentx.model.Game;
import agentx.model.GameBoard;
import agentx.model.Inventory;
import agentx.model.Player;
import agentx.model.TimeShip;
import agentx.view.GameBoardView;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Chris
 */
public class GameControl {
protected final static PrintWriter console = AgentX.getOutFile();
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

    public static void saveGame(Game game, String filePath) throws GameControlExceptions {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(IOException e) {
            throw new GameControlExceptions(e.getMessage());
        }
    }
    

    public enum Tool {
        hammer,
        welder,
        wrench,
        drill;
    }   
    
    public static void ListTools()  {
        
	   ArrayList<String> listtools = new ArrayList<>();
	   listtools.add("Hammer");
	   listtools.add("Welder");
	   listtools.add("Wrench");
	   listtools.add("Drill");

	   /*Unsorted List*/
	   console.println("Before Sorting:");
	   for(String counter: listtools){
			console.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listtools);

	   /* Sorted List*/
	   console.println("After Sorting:");
	   for(String counter: listtools){
			console.println(counter);
		}
	
                }
            }
    
        

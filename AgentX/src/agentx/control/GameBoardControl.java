/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.model.GameBoard;
import agentx.model.Location;
import agentx.model.Scene;
import agentx.model.Scene.SectionOne;
import agentx.exceptions.GameBoardControlExceptions;
import agentx.model.Boss;
import java.io.PrintWriter;

/**
 *
 * @author Chris
 */
public class GameBoardControl {

    protected final static PrintWriter console = AgentX.getOutFile();

    public static GameBoard createGameBoard() throws GameBoardControlExceptions {
        createLocations();
        Object[][] gameBoard = new Object[3][10];
        return null;
    }

    public static void moveActorsToStartingLocation(GameBoard gameBoard) {
        console.println("Move actors to starting locatinon");
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

    // public Location(Boolean visited, Boolean active, Object boss, int puzzle, String description, Double fuel)    
    public static void createLocations() {
        Location L0 = new Location(true, true, null, 0, "You crashed into a construction site.", 0);
        L0.addToDoListItem("Collect Drill");
        L0.addCollectItem("DRILL");
        Location L1 = new Location(false, false, null, 0, "\n"
                + "\nInstruction for using the drill:"
                + "\nYou pick a drillbit that you want to use, and search"
                + "\nfor fuel! Fuel is needed to use the ship, which allows you "
                + "\nto look for Chaotica in a different time. Lets try this out:"
                + "\n"
                + "\nSelect the drillbit you want to use: [1, 2] (Click Q to Quit)", 5);
        Location L2 = new Location(false, false, null, 0, "At the construction site you see a knife.", 3);
        L2.addToDoListItem("Collect Knife");
        L2.addCollectItem("KNIFE");
        Location L3 = new Location(false, false, null, 0, "You find Jackie Chan and he tells you the following: "
                + "The number of attacks you can chain together is limted by the amount of stamina you have."
                + "you can use any weapon that you have on your weapon belt or you can use your fists."
                + "if you want to block it takes up one spot in your attack chain and blocks 50% of the opponents atack damage.", 4);
        Location L4 = new Location(false, false, null, 0, "At the construction site you lift up a board and find a hammer!", 0);
        L4.addToDoListItem("Collect Hammer");
        L4.addCollectItem("HAMMER");
        Location L5 = new Location(false, false, null, 0, "\n\tThere's a rock here. Try smashing it open with the Hammer you picked up in the last location."
                + "\n\tTo use the hammer you type in the command T3.", 4);
        L5.addToDoListItem("Use Hammer on Rock");
        Location L6 = new Location(false, false, null, 0, "You walk into the partially completed building and you do some exploring.", 8);
        L6.addToDoListItem("Collect food.");
        L6.addCollectItem("FOOD");
        Location L7 = new Location(false, false, null, 0, "You examine your time machine and notice that it is not in good shape.", 0);
        L7.addToDoListItem("Repair Ship (Hint: use a tool that you have collected)");
        Boss jarik = new Boss("Jarik", 1, 15);
        Location L8 = new Location(false, false, jarik, 1, "Jarik is in your way. Show him who is boss.", 0);
        L8.addToDoListItem("Kill Jarik");
        Location L9 = new Location(false, false, null, 0, "Looks like Chaotica wasn't here try going to the next time period!", 0);
    }
}

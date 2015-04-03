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
import agentx.exceptions.GameBoardControlExceptions;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class GameBoardControl {

    protected final static PrintWriter console = AgentX.getOutFile();
    public static ArrayList<Location> locations = createLocations();

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
    public static ArrayList<Location> createLocations() {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(true, true, 0));//Location 0
        locations.get(0).addToDoListItem("Collect drill");
        locations.get(0).addCollectItem("DRILL");
        locations.add(new Location(false, false, 5));//Location 1
        locations.add(new Location(false, false, 3));//Location 2
        locations.get(2).addToDoListItem("Collect Knife");
        locations.get(2).addCollectItem("KNIFE");
        locations.add(new Location(false, false, 4));//Location 3
        locations.add(new Location(false, false, 3));//Location 4
        locations.get(4).addToDoListItem("Collect Hammer");
        locations.get(4).addCollectItem("HAMMER");
        locations.add(new Location(false, false, 4));//Location 5
        locations.get(5).addToDoListItem("Use Hammer on Rock");
        locations.add(new Location(false, false, 8));//Location 6
        locations.get(6).addToDoListItem("Collect food.");
        locations.get(6).addCollectItem("FOOD");
        locations.add(new Location(false, false, 0));//Location 7
        locations.get(7).addToDoListItem("Repair Ship (Hint: use a tool that you have collected)");
        locations.add(new Location(false, false, 0));//Location 8
        locations.get(8).addToDoListItem("Kill Jarik");
        locations.add(new Location(false, false, 0));//Location 9
        locations.add(new Location(false, false, 3));//Location 10
        locations.add(new Location(false, false, 3));//Location 11
        locations.add(new Location(false, false, 3));//Location 12
        locations.get(12).addToDoListItem("Collect Welder");
        locations.get(12).addCollectItem("WELDER");
        locations.add(new Location(false, false, 3));//Location 13
        locations.add(new Location(false, false, 3));//Location 14
        locations.get(14).addToDoListItem("Collect grenades");
        locations.get(14).addCollectItem("GRENADES");
        locations.add(new Location(false, false, 3));//Location 15
        locations.get(15).addToDoListItem("Collect Food");
        locations.get(15).addCollectItem("FOOD");
        locations.add(new Location(false, false, 7));//Location 16
        locations.add(new Location(false, false, 3));//Location 17
        locations.add(new Location(false, false, 5));//Location 18
        locations.get(18).addToDoListItem("Fix your Ship");
        locations.add(new Location(false, false, 2));//Location 19
        locations.add(new Location(false, false, 2));//Location 20
        locations.add(new Location(false, false, 1));//Location 21
        locations.add(new Location(false, false,  2));//Location 22
        locations.add(new Location(false, false, 1));//Location 23
        locations.get(23).addToDoListItem("Open ToolBox");
        locations.get(23).addCollectItem("Wrench");
        locations.add(new Location(false, false, 4));//Location 24
        locations.get(24).addToDoListItem("Open SupplyBox");
        locations.get(24).addCollectItem("Food");
        locations.add(new Location(false, false, 1));//Location 25
        locations.add(new Location(false, false, 3));//Location 26
        locations.add(new Location(false, false, 0));//Location 27
        locations.get(27).addToDoListItem("Fix Ship");
        locations.add(new Location(false, false, 1));//Location 28
        locations.get(28).addToDoListItem("Kill Chaotica");
        locations.add(new Location(false, false, 0));//Location 29
        locations.get(29).addToDoListItem("Take Off");
        return locations;
    }
}

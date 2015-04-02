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
        console.println("called createGameboard");
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
        Location L10 = new Location(false, false, null, 0, "You crashed outside an old school", 3);
        Location L11 = new Location(false, false, null, 2, "You are standing at the enterance to the school. "
                + "\nThere is a keypad here and a sign that says..."
                + "\n********************"
                + "\nX=(2*(X-2)+(96/6))/4"
                + "\n********************"
                + "\nEnter the value of X to proceed.", 3);
        Location L12 = new Location(false, false, null, 0, "You are in a toolshop.", 3);
        L12.addToDoListItem("Collect Welder");
        L12.addCollectItem("WELDER");
        Location L13 = new Location(false, false, null, 0, "You have now entered the shop teachers office"
                + "\nAs you explore the office you discover a set\n"
                + "\nof instructions for the welder you found in the shop.\n"
                + "\n"
                + "\nThe instructions said:"
                + "\n\tHow to use your Edison 5000:"
                + "\n\tThe Edison 5000 is the top of the line welder that is ran by"
                + "\n\ta computer, which makes it very simple to use."
                + "\n\t1.)Choose what metal object needs welded"
                + "\n\t2.)You simply type in \"T2\" and then you type in the name of"
                + "\n\tobject the you want welded such as \"ship\""
                + "\n"
                + "\nNow it is your turn to try it!"
                + "\nIn the office you found a few metal pieces that"
                + "\ncame from a puzzle."
                + "\nTry out the weld command by typing in: T4 Puzzle", 3);
        Location L14 = new Location(false,false,null,0,"You are in a robotics lab of some kind.",3);
        L14.addToDoListItem("Collect grenades");
        L14.addCollectItem("GRENADES");
        Location L15 = new Location(false,false,null,0,"You are in the cafeteria."
                + "\nThere's a lot of rotten food out in the buffet but the fridge appears to still be working.",3);
        L15.addToDoListItem("Collect Food");
        L15.addCollectItem("FOOD");
        Location L16 = new Location(false,false,null,0,"You are in the chemistry lab.",7);
        Boss nazeem = new Boss();
        Location L17 = new Location(false,false,nazeem,0,"Nazeem is in your way and confronts you.",3);
        Location L18 = new Location(false,false,null,0,"You're back at your ship. there appears to be a hole in your fuek tank.",5);
        L18.addToDoListItem("Fix your Ship");
        Location L19 = new Location(false,false,null,0,"Its time to take off. Enter your destenation into the ships computer.",2);
        Location L20 = new Location(true, true, null, 0, "You have landed at a what seems to be a tropical"
                + "forest. You should probably explore and calculate the amount of fuel you have.", 2);
    L20.addToDoListItem("Calculate Fuel");
    Location L21 = new Location(false, false, null, 0, "You moved into an old village, which is empty. You move closer, and notice"
                + "that there are bodies everywhere. Maybe this is where Chaotica is right now!", 0);
    L21.addToDoListItem("Drill for Fuel");
    Location L22 = new Location(false, false, null, 0, "The Agent explored the surroundings of the old village, and found a waterfall."
                + "Could this be where Chaotica is hiding? Better explore. ", 2);
    L22.addToDoListItem("Drill for Fuel");
    Location L23 = new Location(false, false, null, 0, "You found an old toolbox under the waterfall. Wonder whats inside of it?", 0);
    L23.addToDoListItem("Open ToolBox");
    L23.addCollectItem("Wrench");
    Location L24 = new Location(false, false, null, 0, "How lucky! There is a box of supplies right next to the toolbox. How convenient.", 4);
    L24.addToDoListItem("Open SupplyBox");
    L24.addCollectItem("Food");
    Location L25 = new Location(false, false, null, 0, "You walk back to the village. I wonder if you need to use the Ship again. Better"
                + "drill for more fuel.", 5);
    L25.addToDoListItem("Drill for Fuel");
    Location L26 = new Location(false, false, null, 0, "Looks like somebody has been at the village meanwhile we were at the waterfall."
                + "It must be the evil Chaotica!", 3);
    L26.addToDoListItem("Drill for Fuel");
    Location L27 = new Location(false, false, null, 0, "Looks like the Ship is broken again, better fix it.", 0);
    L27.addToDoListItem("Fix Ship");
    Boss chaotica = new Boss("Chaotica", 3, 30);
    Location L28 = new Location(false, false, null, 1, "CHAOTICA IS STANDING IN FRONT OF YOU! ATTACK!", 0);
    L28.addToDoListItem("Kill Chaotica");
    Location L29 = new Location(false, false, null, 0, "You decide to return home, now that the galaxy is safe again!", 0);
    L29.addToDoListItem("Take Off");
    }
}

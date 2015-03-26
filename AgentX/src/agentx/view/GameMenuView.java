/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameControl;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.InventoryControlExceptions;
import static java.lang.Character.toUpperCase;
import agentx.view.GameBoardView;
import agentx.view.ViewInterface.View;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matiasmikkola
 */
public class GameMenuView extends View{

    public GameMenuView(){
    super("\n"
            + "\n\t*****************************************************"
            + "\n\t*                    Game Menu                      *"
            + "\n\t*****************************************************"
            + "\n\t* F - Move Forward                                  *"
            + "\n\t* B - Move Backward                                 *"
            + "\n\t* I - Instructions                                  *"
            + "\n\t* V - View Gameboard                                *"
            + "\n\t* O - Other Commands                                *"
            + "\n\t* E - Explore                                       *"
            + "\n\t* M - Main Menu                                     *"
            + "\n\t* S - Save Game                                     *"
            + "\n\t*****************************************************"
            + "\n\t****NOTE: THE FOLLOWING WILL NOT BE IN THIS MENU*****"
            + "\n\t****  THEY ARE JUST FOR ACCESSING SOME LOCATIONS*****"
            + "\n\t****  BEFORE THEY ARE ADDED TO THE GAME BOARD   *****"
            + "\n\t*****************************************************"
            + "\n\t**** T - Take Off                                ****"
            + "\n\t**** P - Puzzle Entrance                         ****"
            + "\n\t**** D - Drill Instructions                      ****"
            + "\n\t**** W - Welder Instructions                     ****"
            + "\n\t**** H - Hammer Instructions                     ****"
            + "\n\t**** X - Strongest Attacking Boss                ****"
            + "\n\t**** Y - Alphabetical order                      ****"
            + "\n\t**** Z - Find Weapon                             ****"
            + "\n\t**** C - CalcNeededFuel View                     ****"
            + "\n\t*****************************************************");
}

    private boolean valid;
    private Object drillInstructionsView;

    /**
     *
     */

    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        switch (selection) {
            case "E":
                ExploreView exploreView = new ExploreView();
                exploreView.display();
                break;
            case "F":
                this.moveForward();
                break;
            case "B":
                this.moveBackward();
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "O":
                OtherCommandsMenuView otherCommandsView = new OtherCommandsMenuView();
                otherCommandsView.display();
                break;
            case "M":
                this.mainMenu();
                return true;
            case "S":
                this.saveGame();
                break;
            case "T":
                TakeOffView takeOffView = new TakeOffView();
                takeOffView.display();
                break;
            case "P":
                EntranceView puzzleView = new EntranceView();
                puzzleView.display();
                break;
            case "D":
                this.drillInstructionsView();
                break;
            case "W":
                WelderInstructionsView welderInstructionsView = new WelderInstructionsView();
                welderInstructionsView.display();
                break;
            case "V":
                GameBoardView gameBoardView = new GameBoardView();
                gameBoardView.display();
                break;
            case "H":
                HammerView hammerView = new HammerView();
                hammerView.display();
                break;
            case "Y":
                GameControl gameControl = new GameControl();
                GameControl.ListTools();
                break;
            case "X":
                PuzzleControl puzzleControl = new PuzzleControl();
                PuzzleControl.hardestBoss();
                break;
            case "Z":
                System.out.println("Please enter the name of a weapon to find its index location.");
                String userSearch = this.getInput();
                InventoryControl inventoryControl = new InventoryControl();

                try {
                    InventoryControl.findWeapon(userSearch);
                } catch (InventoryControlExceptions ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            case "C":
                CalcFuelView calcFuelView = new CalcFuelView();
                calcFuelView.display();
        }
        return false;
    }

    void displayMenu() {
        throw new UnsupportedOperationException("displayMenu"); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveForward() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveBackward() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void instructions() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveOthercommands() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mainMenu() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void drillInstructionsView() {
        DrillInstructionsView drillInstructionsView = new DrillInstructionsView() {
        };
        drillInstructionsView.display();
    }

}

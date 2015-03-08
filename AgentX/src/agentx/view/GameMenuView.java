/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author matiasmikkola
 */
public class GameMenuView {

    private final String GAMEMENU = "\n"
            + "\n\t*****************************************************"
            + "\n\t*                    Game Menu                      *"
            + "\n\t*****************************************************"
            + "\n\t* F - Move Forward                                  *"
            + "\n\t* B - Move Backward                                 *"
            + "\n\t* I - Instructions                                  *"
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
            + "\n\t*****************************************************";

    private boolean valid;
    private Object drillInstructionsView;

    public String getInput() {
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {

            selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();

            if (selection.length() < 1) {
                System.out.println("Input something else");
                continue;
            }
            break;
        }
        return selection;
    }

    /**
     *
     */
    public void displayGameMenu() {

        char selection = ' ';
        do {

            System.out.println(GAMEMENU); //display menu

            String input = this.getInput();
            selection = input.charAt(0);
            selection = toUpperCase(selection);
            this.doAction(selection);

        } while (selection != 'M');
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'E':
                ExploreView exploreView = new ExploreView();
                exploreView.display();
                break;
            case 'F':
                this.moveForward();
                break;
            case 'B':
                this.moveBackward();
                break;
            case 'I':
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case 'O':
                OtherCommandsMenuView otherCommandsView = new OtherCommandsMenuView();
                otherCommandsView.display();
                break;
            case 'M':
                this.mainMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'T':
                TakeOffView takeOffView = new TakeOffView();
                takeOffView.display();
                break;
            case 'P':
                EntranceView puzzleView = new EntranceView();
                puzzleView.display();
                break;
            case 'D':
                this.drillInstructionsView();
                break;
            case 'W':
                WelderInstructionsView welderInstructionsView = new WelderInstructionsView();
                welderInstructionsView.display();
                break;
            case 'H':
                HammerView hammerView = new HammerView();
                hammerView.display();
                break;
        }
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

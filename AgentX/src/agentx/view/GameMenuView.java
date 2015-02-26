/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

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
            + "******NOTE: THE FOLLOWING WILL NOT BE IN THIS MENU*******"
            + "******  THEY ARE JUST FOR ACCESSING SOME LOCATIONS*******"
            + "******  BEFORE THEY ARE ADDED TO THE GAME BOARD   *******"
            + "*********************************************************"
            + "****** T - Take Off                                ******"
            + "****** P - Puzzle Entrance                         ******"
            + "*********************************************************";
    
    
    
    
    private boolean valid;
    
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
            this.doAction(selection);
            
        } while (selection != 'M');
        }
    


    private void doAction(char selection) {
        switch (selection) {
            case 'E':
                ExploreView exploreView = new ExploreView();
                exploreView.displayDrill();
                break;
                case 'F':
                case 'f':
                this.moveForward();
                break;
                case 'B':
                case 'b':
                this.moveBackward();
                break;
                case 'I':
                case 'i':
                this.instructions();
                break;
                case 'O':
                case 'o':
                OtherCommandsMenuView otherCommandsView = new OtherCommandsMenuView();
                otherCommandsView.displayOtherCommandsMenu();
                break;
                case 'M':
                case 'm':
                this.mainMenu();
                break;
                case 'S':
                case 's':
                this.saveGame();
                break;
                case 'T':
                    TakeOffView takeOffView = new TakeOffView();
                    takeOffView.displayTakeOff();
                    break;
                case 'P':
                    
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
    }

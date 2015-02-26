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
            + "\n\t* S - Save Game                                     *";
    
    private boolean valid;
    
            public String getInput() {
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            
            selection = keyboard.nextLine();
            selection = selection.trim();
   
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
        throw new UnsupportedOperationException("doAction"); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMenu() {
        throw new UnsupportedOperationException("displayMenu"); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
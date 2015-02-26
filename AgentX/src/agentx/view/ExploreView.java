/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.PuzzleControl;
import java.util.Scanner;

/**
 *
 * @author matiasmikkola
 */
public class ExploreView {
   private final String EXPLORE = "\n"
           + "\nYou found a spot to drill for fuel! Click any [Enter] to continue!";
   private boolean valid;
   
   
   public void displayDrill() {
       String selection = " ";
        do {
            
            System.out.println(EXPLORE); //display menu
            
            String input = this.getInput();
            selection = input;
            this.doAction(selection);
            
        } while (selection != "M");
   }
   public String getInput() {
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            
            selection = keyboard.nextLine();
            selection = selection.trim();
   
            if (selection.length() < 1) {
                System.out.println("Which drillbit do you want? [1, 2]");
                continue;
            }
            break;
        }
        return selection;
   }      

    private void doAction(String selection) {
        if ("1".equals(selection)) {
            PuzzleControl puzzleControl = new PuzzleControl();
            double drillDepth = PuzzleControl.calcDrillDepth(selection);
            System.out.println("You collected: " + drillDepth);       
        }
        else if ("2".equals(selection)) {
            PuzzleControl puzzleControl = new PuzzleControl();
            double drillDepth = PuzzleControl.calcDrillDepth(selection);
            System.out.println("You collected: " + drillDepth);
          
    }
        else {
            System.out.println("Invalid drillbit");
            return;
        }
        
}
}

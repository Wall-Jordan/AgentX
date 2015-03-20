/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.view.ViewInterface.View;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matiasmikkola
 */
public class ExploreView {

    public void display() {
        String value;
        double drillDepth = 0;
        
        do {

            System.out.println("\nYou found a spot to drill for fuel! Enter the drillbit you want to use or hit S to move on.");
            value = this.getInput();
            if (!"S".equals(value)){
            drillDepth = this.doAction(value);
            } else {
                drillDepth = 1;
            }

        } while (drillDepth==0);
        if ("S".equals(value)) {
            System.out.println("You've decided to not drill right now. That's fine, you can come back later.");
            return;
        } else {
            System.out.println("You collected: " + drillDepth);
            return;
        }
    }
    
    public String getInput() {

            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;
            String selection = null;

            while (!valid) {

                System.out.println("Enter your selection");
                selection = keyboard.nextLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {
                    System.out.println("Invalid Selection. Please try again.");
                    continue;
                }
                break;

            }
            return selection;

        }

    public double doAction(String value) {

        value = value.toUpperCase();
        String choice = value;
        double drillDepth = 0;

        try {
            PuzzleControl puzzleControl = new PuzzleControl();
            drillDepth = PuzzleControl.calcDrillDepth(choice);
        } catch (PuzzleControlExceptions pe) {
            System.out.println(pe.getMessage());
        }

        return drillDepth;
    }
}

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
public class ExploreView extends View {

    public ExploreView() {
        super("\n"
                + "\nYou found a spot to drill for fuel! Enter the drillbit you want to use or hit S to move on.");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        String choice = value;

        if ("1".equals(choice)) {
            try {
                PuzzleControl puzzleControl = new PuzzleControl();
                double drillDepth;
                drillDepth = PuzzleControl.calcDrillDepth(choice);
                System.out.println("You collected: " + drillDepth);
            } catch (PuzzleControlExceptions pe) {
                System.out.println(pe.getMessage());
            }
        } else if ("2".equals(choice)) {
            try {
                PuzzleControl puzzleControl = new PuzzleControl();
                double drillDepth = PuzzleControl.calcDrillDepth(choice);
                System.out.println("You collected: " + drillDepth);
            } catch (PuzzleControlExceptions pe) {
                System.out.println(pe.getMessage());
            }
        } else if ("S".equals(choice)) {
            System.out.println("You've decided to not drill right now. That's fine, you can come back later.");
            return false;
        }
        return true;
    }
}

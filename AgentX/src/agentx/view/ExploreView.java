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
        super("\nYou found a spot to drill for fuel! Enter the drillbit you want to use or hit S to move on.");
    }


    @Override
    public boolean doAction(Object obj) {
        String choice = (String) obj;

        double drillDepth = 0;

        try {
            PuzzleControl puzzleControl = new PuzzleControl();
            drillDepth = PuzzleControl.calcDrillDepth(choice);
        } catch (PuzzleControlExceptions pe) {
            System.out.println(pe.getMessage());
        }
        
        if ("S".equals(choice)) {
            System.out.println("You've decided to not drill right now. That's fine, you can come back later.");
        } else if(drillDepth > 0) {
            System.out.println("You collected: " + drillDepth);
        } else {
            return false;
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.PuzzleControl;
import agentx.view.ViewInterface.View;

/**
 *
 * @author matiasmikkola
 */
public abstract class DrillInstructionsView extends View{

    
    public DrillInstructionsView() {
        super("\n"
            + "\nInstruction for using the drill:"
            + "\nYou pick a drillbit that you want to use, and search"
            + "\nfor fuel! Fuel is needed to use the ship, which allows you "
            + "\nto look for Chaotica in a different time. Lets try this out:"
            + "\n"
            + "\nSelect the drillbit you want to use: [1, 2] (Click Q to Quit)");
    }

    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        String choice = value;
        
                if ("1".equals(choice)) {
            PuzzleControl puzzleControl = new PuzzleControl();
            double drillDepth = PuzzleControl.calcDrillDepth(choice);
            System.out.println("You collected: " + drillDepth);
            
                    } else if ("2".equals(choice)) {
            PuzzleControl puzzleControl = new PuzzleControl();
            double drillDepth = PuzzleControl.calcDrillDepth(choice);
            System.out.println("You collected: " + drillDepth);
            
                    } else if ("Q".equals(choice)) {
            System.out.println("Looks like you are done practicing. Good luck!");
            return false;
        } else {
            System.out.println("Invalid drillbit");
            return true;
}
        return true;
    
}
}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;
import agentx.view.ViewInterface.View;

/**
 *
 * @author Jordan
 */
public class OtherCommandsMenuView extends View {

    public OtherCommandsMenuView() {
        super("\n"
                + "\n*****************************************************"
                + "\n*             Other Commands Menu                   *"
                + "\n*****************************************************"
                + "\n\tC $item name$ - Collect item"
                + "\n\tD - Drill for Fuel"
                + "\n\tM - Show Game Board"
                + "\n\tT1 - Use Wrench"
                + "\n\tT2 - Use Welder"
                + "\n\tT3 - Use Hammer"
                + "\n\tT4 - Use Drill"
                + "\n\tI -  Inventory"
                + "\n*****************************************************"
                + "\nEnter R to return to the location.");
    }

    @Override
    public boolean doAction(Object obj) {
        String choice = (String) obj;

        switch (choice) {
            case "R":
                break;
            default:
                console.println("\n Invalid selection, try again!");
                return false;

        }
        return true;
    }
}
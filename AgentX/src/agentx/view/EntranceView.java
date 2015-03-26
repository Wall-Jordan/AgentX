/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.PuzzleControl;
import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class EntranceView extends View {

    private boolean result;

    public EntranceView() {
        super("");
    }

    @Override
    public void display() {

        do {
            this.console.println("\n"
                    + "\n\tYou are at a door. Next to the door is a security keypad. Above the keypad is a small sign that says..."
                    + "\n\tX=(2*(X-2)+(96/6))/4"
                    + "\n\n\tSolve for X to Enter! ONLY ENTER NUMBERS!!!");
            String input = this.getInput();
            
            try {
                double userIn = Double.parseDouble(input);
                this.doAction(userIn);
            } catch (NumberFormatException nf) {
                this.console.println("\n You must enter in a number.");
            }


        } while (result == false);

    }

    @Override
    public boolean doAction(Object obj) {
        double number = (double) obj;
        boolean test = PuzzleControl.calcEntrance(number);
        if (test == true) {
            this.console.println("\n\tCORRECT! You may now proceed.");
            result = true;
        } else {
            this.console.println("\n\tWRONG!!! Please try again.");
            result = false;
            return result;
        }
        return result;
    }
}

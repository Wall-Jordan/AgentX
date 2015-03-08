/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class WelderInstructionsView extends View {

    public WelderInstructionsView() {
        super("\n"
                + "\n\t\t\t---Shop Teachers Office---"
                + "\n"
                + "\n\tYou have now entered the office of Mr. Schwartzenbeger, who was"
                + "\n\tthe shop teacher of Slagem High School."
                + "\n"
                + "\n\tAs you explore Mr. Schwartzenbeger's office you discover a set"
                + "of instructions for the welder you found in the shop."
                + "\n"
                + "\n\tThe instructions said:"
                + "\n\t\t\tHow to use your Edison 5000:"
                + "\n\t\tThe Edison 5000 is the top of the line welder that is ran by"
                + "\n\t\ta computer, which makes it very simple to use."
                + "\n\t\t1.)Choose what metal object needs welded"
                + "\n\t\t2.)You simply type in \"T2\" and then you type in the name of"
                + "\n\t\t object the you want welded such as \"ship\""
                + "\n"
                + "\n\tNow it is your turn to try it!"
        );
    }

    private final String WELD = "\tIn the office you found a few metal pieces that"
            + "\n\tcame from a puzzle."
            + "\n"
            + "\n\t Try out the weld command by typing in: T4 Puzzle";

    @Override
    public void display() {
        String weldInput = " ";

        boolean welded = false;
        String goBack = " ";

        System.out.println(WELD);

        do {
            String input = this.getInput();
            weldInput = input;

            welded = this.doAction(weldInput);

        } while (!welded);

        return;
    }

    @Override
    public String getInput() {
        String weld = null;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welder Input:");

        weld = keyboard.nextLine();
        weld = weld.trim();
        weld = weld.toUpperCase();

        return weld;
    }
    
    @Override
    public boolean doAction(Object obj) {
        String weldInput = (String) obj;

        if ("T4 PUZZLE".equals(weldInput)) {
            System.out.println("\tCongradulations you welded the puzzle together!"
                    + "\n\tThe puzzle says: 2046ad");
            return true;

        } else {
            System.out.println("\nSorry that item is not found try welding something else.");
        }
        return false;
    }
}

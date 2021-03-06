/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.view.ViewInterface.View;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jordan
 */
public class WelderInstructionsView extends View {

    protected final static PrintWriter console = AgentX.getOutFile();
    
    public WelderInstructionsView() {
        super(" ");
    }

    private final String WELD_INSTRUCTIONS = "\n"
            + "\n\t\t\t---Shop Teachers Office---"
            + "\n"
            + "\n\tYou have now entered the office of Mr. Schwartzenbeger, who was"
            + "\n\tthe shop teacher of Slagem High School."
            + "\n"
            + "\n\tAs you explore Mr. Schwartzenbeger's office you discover a set"
            + "\n\tof instructions for the welder you found in the shop."
            + "\n"
            + "\n\tThe instructions said:"
            + "\n\t\t\tHow to use your Edison 5000:"
            + "\n\t\tThe Edison 5000 is the top of the line welder that is ran by"
            + "\n\t\ta computer, which makes it very simple to use."
            + "\n\t\t1.)Choose what metal object needs welded"
            + "\n\t\t2.)You simply type in \"T2\" and then you type in the name of"
            + "\n\t\t object the you want welded such as \"ship\""
            + "\n"
            + "\n\tNow it is your turn to try it!";

    private final String WELD = "\tIn the office you found a few metal pieces that"
            + "\n\tcame from a puzzle."
            + "\n"
            + "\n\t Try out the weld command by typing in: T2 Puzzle";

    @Override
    public void display() {
        console.println(WELD_INSTRUCTIONS);

        String weldInput = " ";

        boolean welded = false;
        String goBack = " ";

        console.println(WELD);

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

        console.println("Welder Input:");

        try {
            weld = keyboard.readLine();
            weld = weld.trim();
            weld = weld.toUpperCase();
        } catch (Exception e) {
            ErrorView.display("WelderInstructionsView.java", "Error reading input: " + e.getMessage());
        }

        return weld;
    }

    @Override
    public boolean doAction(Object obj) {
        String weldInput = (String) obj;

        if ("T2 PUZZLE".equals(weldInput)) {
            console.println("\tCongratulations you welded the puzzle together!"
                    + "\n\tThe puzzle says: 2046");
            return true;

        } else {
            console.println("\nSorry that item is not found try welding something else.");
        }
        return false;
    }
}

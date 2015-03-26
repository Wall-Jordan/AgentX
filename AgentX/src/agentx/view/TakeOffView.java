/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jordan
 */
public class TakeOffView extends View {

    public TakeOffView() {
        super("");
    }
    private final String TAKE_OFF = "************* TAKE OFF *************";

    @Override
    public void display() {
        String year = " ";

        boolean traveled = false;
        String goBack = " ";

        do {
            this.console.println(TAKE_OFF);

            String input = this.getInput();
            year = input;

            traveled = this.doAction(year);

            if (traveled == false) {
                goBack = this.getInput2();
            } else {
                goBack = "Y";
            }
        } while (!"Y".equals(goBack));

        if (traveled == true) {
            this.console.println("You are now in " + year + ".");
        } else {
            this.console.println("Go back and look for year clue.");
        }
        return;

    }

    @Override
    public String getInput() {
        String year = null;

        this.console.println("Destination year:");

        try {
            year = this.keyboard.readLine();
            year = year.trim();
            year = year.toUpperCase();
        } catch (Exception e) {
            this.console.println("Error reading input: " + e.getMessage());
        }

        return year;
    }

    private String getInput2() {
        String selection = null;

        this.console.println("Would you like to go back? [Y, N]");
        try {
            selection = this.keyboard.readLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
        } catch (Exception e) {
            ErrorView.display("TakeOffView.java","Error reading input: " + e.getMessage());
        }
        return selection;
    }

    @Override
    public boolean doAction(Object obj) {
        String year = (String) obj;
        if ("3097AD".equals(year)) {
            return true;
        } else if ("2046AD".equals(year)) {
            return true;
        } else {
            this.console.println("Wrong year to travel to. You may want to go back "
                    + "to the explore sections in this time period and find year clue.");
            return false;
        }
    }
}

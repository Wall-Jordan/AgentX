/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.exceptions.PuzzleControlExceptions;
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
public class CalcFuelView extends View {
    
    protected final static PrintWriter console = AgentX.getOutFile();
        
    public CalcFuelView() {
        super(" ");
    }

    @Override
    public void display() {
        boolean result = false;

        do {
            console.println("\n\t Calculate How Much Fuel You Need for Time Travel:");
            String input = this.getInput();

            try {
                int userIn = Integer.parseInt(input);
                result = this.doAction(userIn);
            } catch (NumberFormatException nf) {
                console.println("\n You must enter in a number.");
            }

        } while (result == false);

    }

    @Override
    public String getInput() {

        String year = null;

        console.println("How many years are you going to travel?");
        try {
            year = this.keyboard.readLine();
            year = year.trim();
            year = year.toUpperCase();

        } catch (Exception e) {
            ErrorView.display("CalcFuelView.java", "Error reading input: " + e.getMessage());
        }
        return year;
    }

    @Override
    public boolean doAction(Object obj) {
        int userSelection = (int) obj;
        double mass = 500;
        double fuelType = 1;

        try {
            int gallonsOfFuel = agentx.control.PuzzleControl.calcNeededFuelAmount(userSelection, fuelType, mass);
            console.println("You will need to collect " + gallonsOfFuel + " gallons of fuel.");
            return true;
        } catch (PuzzleControlExceptions pe) {
            console.println(pe.getMessage());
            return false;
        }
    }

}

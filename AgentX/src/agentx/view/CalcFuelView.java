/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.exceptions.PuzzleControlExceptions;
import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class CalcFuelView extends View {

    public CalcFuelView() {
        super(" ");
    }

    @Override
    public void display() {
        boolean result = false;
        
        do {
            System.out.println("\n\t Calculate How Much Fuel You Need for Time Travel:");
            String input = this.getInput();

            try {
                int userIn = Integer.parseInt(input);
                result = this.doAction(userIn);
            } catch (NumberFormatException nf) {
                System.out.println("\n You must enter in a number.");
            }

        } while (result == false);

    }

    @Override
    public String getInput() {
        String year = null;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many years are you going to travel?");

        year = keyboard.nextLine();
        year = year.trim();
        year = year.toUpperCase();

        return year;
    }

    @Override
    public boolean doAction(Object obj) {
        int userSelection = (int) obj;
        double mass = 500;
        double fuelType = 1;
        
        try {
            int gallonsOfFuel = agentx.control.PuzzleControl.calcNeededFuelAmount(userSelection, fuelType, mass);
            System.out.println("You will need to collect " + gallonsOfFuel + " gallons of fuel.");
            return true;
        } catch(PuzzleControlExceptions pe){
            System.out.println(pe.getMessage());
            return false;
        }
    }

}

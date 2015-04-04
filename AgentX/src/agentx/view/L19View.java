/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.control.GameBoardControl.createLocations;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import static agentx.view.L10View.ship2;
import static agentx.view.L20View.ship3;
import agentx.view.ViewInterface.View;
import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L19View extends View {

    public L19View() {
        super("You crashed outside an old school\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nF  - Check Fuel"
                + "\nTAKEOFF  - Take Off"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = createLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(19).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
                case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(19).getFuel();
                        locations.get(19).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L18View.java", pce.getMessage());
                }
                break;
            case "TAKEOFF":
                int currentYear = 3097;
                boolean shipFixed = ship2.getStatus();
                double shipFuel = ship2.fuel.getGallons();
                if (!shipFixed) {
                    console.println("You can not take off. Your ship needs fixed.");
                    return true;
                } else {
                    boolean traveled = false;
                    String goBack = "";
                    String year = getYear();

                    do {
                        boolean validYear = false;
                        while (!validYear) {
                            validYear = yearCheck(year);
                            if (!validYear) {
                                goBack = getInput2();
                            }
                            if ("Y".equals(goBack)) {
                                break;
                            }
                        }

                    } while (!"Y".equals(goBack));
                    int destinationYear = Integer.parseInt(year);

                    double yearsToTravel = abs(destinationYear - currentYear);

                    try {
                        int neededFuelAmount = PuzzleControl.calcNeededFuelAmount(yearsToTravel, 3, 50);
                        if (shipFuel >= neededFuelAmount) {
                            traveled = true;
                        }
                    } catch (PuzzleControlExceptions pce) {
                        ErrorView.display("L29View.java", pce.getMessage());
                    }

                    if (traveled == true) {
                        this.console.println("You are now in" + year + ".");
                        locations.get(29).setComplete(true);

                    } else {
                        this.console.println("Go back and look for a year clue.");
                    }
                }
                break;
        }

        return false;
    }

    private String getInput2() {
        String selection = null;

        console.println("Would you like to go back? [Y, N]");
        try {
            selection = this.keyboard.readLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
        } catch (Exception e) {
            ErrorView.display("TakeOffView.java", "Error reading input: " + e.getMessage());
        }
        return selection;
    }

    public boolean yearCheck(String year) {
        if (null != year) {
            switch (year) {
                case "2046":
                    return true;
                default:
                    this.console.println("Wrong year to travel to. You may want to go back "
                            + "to the explore sections in this time period and find year clue.");
                    return false;
            }
        }
        return true;

    }

    public String getYear() {
        String year = "";

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
}

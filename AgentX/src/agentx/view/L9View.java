/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import static agentx.view.L0View.ship1;
import static agentx.view.L20View.ship3;
import agentx.view.ViewInterface.View;
import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L9View extends View {

    public L9View() {
        super("You crashed into a construction site.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nI - Instructions"
                + "\nV - Return to Map"
                + "\nTAKE OFF - Take Off"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(9).getToDoList()) {
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
                    if (6 <= drillDepth) {
                        fuel = locations.get(9).getFuel();
                        locations.get(9).setFuel(0);

                    }

                    InventoryControl.AddFuel1(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship1.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L2View.java", pce.getMessage());
                }

                break;
            case "TAKE OFF":
                int currentYear = 1945;
                boolean shipFixed = ship1.getStatus();
                double shipFuel = ship1.fuel.getGallons();
                if (!shipFixed) {
                    console.println("You can not take off. Your ship needs fixed.");
                    return true;
                } else {
                    boolean traveled = false;
                    String goBack = "";
                    String year = " ";
                    boolean validYear = false;
                    boolean needFuel = false;

                    do {
                        while (!validYear) {
                            year = getYear();
                            validYear = yearCheck(year);
                            if (validYear) {
                                break;
                            } else {
                                goBack = getInput2();
                            }

                            if ("Y".equals(goBack)) {
                                break;
                            }
                        }
                        if (!"Y".equals(goBack)) {
                            double destinationYear = Integer.parseInt(year);
                            double yearsToTravel = abs(destinationYear - currentYear);

                            try {
                                int neededFuelAmount = PuzzleControl.calcNeededFuelAmount(yearsToTravel, 1, 50);
                                if (shipFuel >= neededFuelAmount) {
                                    traveled = true;
                                    goBack = "Y";
                                } else {
                                    needFuel = true;
                                    goBack = "Y";
                                }
                            } catch (PuzzleControlExceptions pce) {
                                ErrorView.display("L9View.java", pce.getMessage());
                            }
                        }
                    } while (!"Y".equals(goBack));

                    if (traveled == true) {
                        this.console.println("You are now in " + year + ".");
                        locations.get(9).setComplete(true);
                        return true;

                    } else if (needFuel) {
                        this.console.println("\nYou need more fuel to travel to that year!"
                                + "\nGo back and drill for more fuel.\n");
                        return true;
                    } else {
                        this.console.println("Go back and look for a year clue.\n");
                        return true;
                    }
                }
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
                case "3097":
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

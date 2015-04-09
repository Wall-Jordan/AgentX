/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
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
                + "\nI  - Instructions"
                + "\nV  - Return to Map"
                + "\nTAKE OFF - Take Off"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = AgentX.getCurrentGame().getLocations();
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

                    InventoryControl.AddFuel(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L18View.java", pce.getMessage());
                }
                break;
            case "RFO":
                InventoryControl.AddFuel(50);
                console.println("You collected " + 50 + " gallons of fuel. You now have " + AgentX.getPlayer().fuelContainer.getGallons() + " gallons of fuel.");
                break;
            case "TAKE OFF":
                int currentYear = 3097;
                boolean shipFixed = AgentX.getPlayer().getTimeShip().getStatus();
                double shipFuel = AgentX.getPlayer().fuelContainer.getGallons();
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
                                int neededFuelAmount = PuzzleControl.calcNeededFuelAmount(yearsToTravel, 2, 50);
                                if (shipFuel >= neededFuelAmount) {
                                    traveled = true;
                                    goBack = "Y";
                                } else {
                                    needFuel = true;
                                    goBack = "Y";
                                }
                            } catch (PuzzleControlExceptions pce) {
                                ErrorView.display("L19View.java", pce.getMessage());
                            }
                        }
                    } while (!"Y".equals(goBack));

                    if (traveled == true) {
                        this.console.println("You are now in " + year + ".");
                        locations.get(19).setComplete(true);
                        AgentX.getPlayer().fuelContainer.setGallons(0.0);
                        AgentX.getPlayer().getTimeShip().setStatus(false);
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

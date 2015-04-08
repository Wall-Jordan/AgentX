////
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package agentx.view;

import agentx.control.GameBoardControl;
import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.getDrillBit;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.FuelContainer;
import agentx.model.Location;
import static agentx.view.L20View.ship3;
import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class L29View extends ViewInterface.View {

    public L29View() {
        super("You decide to return home, now that the galaxy is safe again!"
                + " Return to year 2015!\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO  - Other commands menu"
                + "\nI  - Instructions"
                + "\nV  - View Gameboard"
                + "\nF  - Check Fuel"
                + "\nTAKE OFF  - Take Off"
                + "\n****************************************\n");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.getLocations();
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(29).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
            case "V":
                return true;
            case "T4":
                try {
                    String drillBit = getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (drillDepth == 4) {
                        fuel = locations.get(29).getFuel();
                        locations.get(29).setFuel(0);

                    }
                    InventoryControl.AddFuel3(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship3.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L29View.java", pce.getMessage());
                }

                break;
            case "TAKE OFF":
                int currentYear = 2046;
                boolean shipFixed = ship3.getStatus();
                double shipFuel = ship3.fuel.getGallons();
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
                                ErrorView.display("L29View.java", pce.getMessage());
                            }
                        }
                    } while (!"Y".equals(goBack));

                    if (traveled == true) {
                        this.console.println("You are now in " + year + ".");
                        locations.get(29).setComplete(true);
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
                case "2015":
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

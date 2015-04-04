////
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.getDrillBit;
import agentx.control.PuzzleControl;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.FuelContainer;
import agentx.model.Location;
import static agentx.view.L20View.ship3;
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
                + "\nTAKEOFF  - Take Off"
                + "\n****************************************\n");
    }

//    public String getYear() {
//        String year;
//
//        this.console.println("Destination year:");
//
//        try {
//            year = this.keyboard.readLine();
//            year = year.trim();
//            year = year.toUpperCase();
//        } catch (Exception e) {
//            this.console.println("Error reading input: " + e.getMessage());
//        }
//
//        return year;
//    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations;
        locations = GameBoardControl.locations;
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
                        fuel = locations.get(21).getFuel();
                        locations.get(21).setFuel(0);

                    }
                    InventoryControl.AddFuel3(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship3.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L21View.java", pce.getMessage());
                }
                
                return false;
        }
        
        return false;
        
    }
}
    

//            case "TAKEOFF":
//                boolean shipFixed = ship3.getStatus();
//                FuelContainer shipFuel = ship3.getFuel();
//                if (!shipFixed) {
//                    console.println("You can not take off. Your ship needs fixed.");
//                    return true;
//                } else {
//                    String year;
//                    boolean traveled = false;
//                    String goBack;
//
//                    do {
////                      String year = this.getYear();
//                        boolean validYear = false;
//                        while(!validYear){
//                        validYear = yearCheck(year);
//                        if (!validYear){
//                          goBack=getInput2();
//                        }
//                        if ("Y".equals(goBack){
//                        break;
//                        }
//                        }
// 
//                    } while (!"Y".equals(goBack));
//
//                    if (traveled == true) {
//                        this.console.println("You are now in" + year + ".");
//                    } else {
//                        this.console.println("Go back and look for a year clue.");
//                    }
//                    break;
//                }
//        }
//    
//        private String getInput2() {
//        String selection = null;
//
//        this.console.println("Would you like to go back? [Y, N]");
//        try {
//            selection = this.keyboard.readLine();
//            selection = selection.trim();
//            selection = selection.toUpperCase();
//        } catch (Exception e) {
//            ErrorView.display("TakeOffView.java", "Error reading input: " + e.getMessage());
//        }
//        return selection;
//    }
//}
//public boolean yearCheck(String year) {
//        if ("3097AD".equals(year)) {
//            return true;
//        } else if ("2046AD".equals(year)) {
//            return true;
//        } else if ("2015".equals(year)) {
//            GameEndView gameEndView = new GameEndView();
//            gameEndView.display();
//        } else {
//            this.console.println("Wrong year to travel to. You may want to go back "
//                    + "to the explore sections in this time period and find year clue.");
//            return false;
//        }
//        return true;
//    
//    }

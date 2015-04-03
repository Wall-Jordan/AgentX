/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import static agentx.control.GameBoardControl.createLocations;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L9View extends View{
    public L9View() {
        super("You crashed into a construction site.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
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
                break;
            case "V":
                return true;
        }

        return true;
    }
    
    public String getDrillBit() {

            boolean valid = false;
            String selection = null;
            try {
                while (!valid) {

                    console.println("Choose drill bit: ");
                    selection = this.keyboard.readLine();
                    selection = selection.trim();
                    selection = selection.toUpperCase();

                    if (selection.length() < 1) {

                        console.println("Invalid Selection. Please try again.");
                        continue;

                    }
                    break;
                }
            } catch (Exception e) {
                console.println("Error reading input: " + e.getMessage());
            }

            return selection;

        }
}

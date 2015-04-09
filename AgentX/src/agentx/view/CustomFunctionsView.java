/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameControl;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import agentx.exceptions.InventoryControlExceptions;

import agentx.view.ViewInterface.View;


/**
 *
 * @author matiasmikkola
 */
public class CustomFunctionsView extends View{

    public CustomFunctionsView(){
    super("\n\t*****************************************************"
            + "\n\t**** A - Strongest Attacking Boss                ****"
            + "\n\t**** S - Alphabetical order                      ****"
            + "\n\t**** D - Find Weapon                             ****"
            + "\n\t**** F - Create Weapons Report                   ****"
            + "\n\t**** G - Create List Tools                       ****"
            + "\n\t**** H - Create Boss List                        ****"
            + "\n\t**** M - Return to Main Menu                     ****"
            + "\n\t*****************************************************");
}

    private boolean valid;
    private Object drillInstructionsView;

    /**
     *
     */

    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        switch (selection) {
            
            case "F":
                WeaponsReportView weaponsReportView = new WeaponsReportView();
                weaponsReportView.display();
                break;
            case "S":
                GameControl gameControl = new GameControl();
                GameControl.listTools();
                break;
            case "A":
                PuzzleControl puzzleControl = new PuzzleControl();
                PuzzleControl.hardestBoss();
                break;
            case "D":
                console.println("Please enter the name of a weapon to find its index location.");
                String userSearch = this.getInput();
                InventoryControl inventoryControl = new InventoryControl();

                try {
                    InventoryControl.findWeapon(userSearch);
                } catch (InventoryControlExceptions ex) {
                    ErrorView.display("GameMenuView.java", ex.getMessage());
                }

                break;
            case "G":
                ListToolView listToolView = new ListToolView();
                listToolView.display();
                break;
                
            case "H":
                BossPrintView bossPrintView = new BossPrintView();
                bossPrintView.display();
                break;
            case "M":
                return true;
        }
        return false;
    }


}

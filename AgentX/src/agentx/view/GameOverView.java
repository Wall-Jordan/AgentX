/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.view.InventoryView.console;
import agentx.view.ViewInterface.View;

/**
 *
 * @author matiasmikkola
 */
public class GameOverView extends View{
    
    public GameOverView() {
        super("\n"
                + "!!! GAME OVER !!!\n"
                + "Click [E] to Exit");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String choice = (String) obj;

        switch (choice) {
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                return true;
            default:
                console.println("\n Invalid selection, try again!");
                break;
        }
        return false;
    }
}

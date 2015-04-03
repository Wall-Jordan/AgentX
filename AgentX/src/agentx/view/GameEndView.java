/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;

/**
 *
 * @author matiasmikkola
 */
public class GameEndView extends View {
    
    public GameEndView() {
        super("\n"
                + "**********************************\n"
                + "* CONGRATULATIONS, YOU HAVE WON! *\n"
                + "**********************************");
    }
    
//    @Override
//    
//    public boolean doAction(Object obj) {
//        String value = (String) obj;
//
//        value = value.toUpperCase();
//        char choice = value.charAt(0);
//
//        switch (choice) {
//            case 'E':
//                this.displayExit();
//                break;
//            default:
//                console.println("\n Invalid selection, try again!");
//        }
//        return true;
//    }

    private boolean displayExit() {
        return false;
    }
}

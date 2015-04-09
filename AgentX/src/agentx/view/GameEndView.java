/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;
import static java.lang.System.exit;

/**
 *
 * @author matiasmikkola
 */
public class GameEndView extends View {

    public GameEndView() {
        super("");
    }

    @Override
    public void display() {
        String value;
        boolean done = false;

        do {

            console.println("\n"
                    + "***************************************\n"
                    + "* CONGRATULATIONS, YOU HAVE DEFEATED  *\n"
                    + "*     CHAOTICA, AND WON THE GAME!     *\n"
                    + "*         GOOD JOB AGENT!!           *\n"
                    + "***************************************"
                    + "\nE - To Exit");
            value = this.getInput();
            done = this.doAction(value);

        } while (!done);
    }

    @Override

    public boolean doAction(Object obj) {
        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'E':
                this.displayExit();
                break;
            default:
                console.println("");
        }
        return false;
    }

    private void displayExit() {
        exit(0);
    }
}

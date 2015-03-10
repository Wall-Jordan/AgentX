/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;

/**
 *
 * @author Chris
 */
public class HammerView extends View {

    public HammerView() {
        super("\n\tThere's a rock here. Try smashing it open with the Hammer you picked up in the last location."
                + "\n\tIf you nead help, just enter I for the game instructions.");
    }

    @Override
    public boolean doAction(Object obj) {
        String userSelection = (String) obj;
        switch (userSelection) {
            case "T3":
                staminaStub();
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid Selection. Please try again");
                break;
        }
        return false;
    }

    private void staminaStub() {
        System.out.println("You cracked open the rock, found some water, drank it, and now have +3 stamina.");
    }

}

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
public class DrillInstructionsView extends View{

    
    public DrillInstructionsView(String promptMessage) {
        super(promptMessage);
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        System.out.println("Hello");
        return false;
    }
    
}

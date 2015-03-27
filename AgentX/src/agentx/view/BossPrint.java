/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;

/**
 *
 * @author Jordan
 */
public class BossPrint extends View{

    public BossPrint() {
        super("Please enter in the filepath to save the Boss Location Report.");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String filepath = (String) obj;
        
    }
}

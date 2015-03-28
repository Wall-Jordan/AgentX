/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class ListToolPrint extends View {
    
    ListToolPrint(){
        super("Please enter the file path to save your list.");
    }

    
   @Override
    public boolean doAction(Object obj){
        
        String filePath = (String) obj;
        ArrayList<String> listtools;
        listtools = agentx.control.GameControl.listtools();
        
        
        
        return true;
    
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.InventoryControl;
import agentx.model.Weapon;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class WeaponsReportView extends View {
    
    WeaponsReportView(){
        super("Please enter the file path to save your report.");
    }
    
    
    
    @Override
    public boolean doAction(Object obj){
        
        String filePath = (String) obj;
        ArrayList<Weapon> weaponsArray = agentx.control.InventoryControl.createWeaponsList();
        
        
        
        return true;
    }
}

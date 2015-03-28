/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import static agentx.control.GameControl.createBossList;
import agentx.model.Boss;
import agentx.view.ViewInterface.View;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class BossPrintView extends View{

    public BossPrintView() {
        super("Please enter in the filepath to save the Boss Location Report.");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String filePath = (String) obj;
        ArrayList<Boss> bossArray = createBossList();
        
        try (FileWriter fw = new FileWriter(filePath)){
            console.println("The following information was written to " + filePath + ":" );
            try{
                for (int i=0; i<bossArray.size(); i++){
                    Boss boss = bossArray.get(i);
                    fw.write("Boss Name: " + boss.getBossName() + "\tAttack Damage: " + boss.getDamage() 
                            + "\t Location: <" + boss.getY() + "," + boss.getX() + ">");
                    fw.write(System.getProperty( "line.separator" ));
                    console.println("Boss Name: " + boss.getBossName() + "\tAttack Damage: " + boss.getDamage() 
                            + "\t Location: <" + boss.getY() + "," + boss.getX() + ">");
                }
            }catch(IOException e){
                ErrorView.display("BossPrintView.java", e.getMessage());
            }
        }catch(Exception ex){
            ErrorView.display("BossPrintView.java", ex.getMessage());
        }
        return true;
    }
}

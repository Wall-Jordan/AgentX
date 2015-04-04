/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Backpack implements Serializable {

    private static ArrayList<String> item = new ArrayList<>();

    public void addTool(String toolName){
        item.add(toolName);
    }
    public void removeTool(String toolName){
        item.remove(toolName);
    }
    public ArrayList<String> getItems(){
        return item;
    }
    
    public Backpack() {
    }

}


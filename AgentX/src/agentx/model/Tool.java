/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author matiasmikkola
 */
public class Tool implements Serializable {

    private int quantity;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public Tool(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   

}


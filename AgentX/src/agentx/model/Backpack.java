/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Backpack implements Serializable {

    private String backpackItems;

    public Backpack() {
    }

    public String getBackpackItems() {
        return backpackItems;
    }

    public void setBackpackItems(String backpackItems) {
        this.backpackItems = backpackItems;
    }

    @Override
    public String toString() {
        return "Backpack{" + "backpackItems=" + backpackItems + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.backpackItems);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Backpack other = (Backpack) obj;
        if (!Objects.equals(this.backpackItems, other.backpackItems)) {
            return false;
        }
        return true;
    }

}
